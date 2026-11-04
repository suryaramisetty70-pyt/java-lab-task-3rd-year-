import java.util.ArrayList;

public class Week8_Task4_JavaVisitorPattern {
    enum Color {
        RED, GREEN
    }

    abstract static class Tree {
        private int value;
        private Color color;
        private int depth;

        public Tree(int value, Color color, int depth) {
            this.value = value;
            this.color = color;
            this.depth = depth;
        }

        public int getValue() { return value; }
        public Color getColor() { return color; }
        public int getDepth() { return depth; }

        public abstract void accept(TreeVisitor visitor);
    }

    static class TreeNode extends Tree {
        private ArrayList<Tree> children = new ArrayList<>();

        public TreeNode(int value, Color color, int depth) {
            super(value, color, depth);
        }

        public void addChild(Tree child) {
            children.add(child);
        }

        public void accept(TreeVisitor visitor) {
            visitor.visitNode(this);
            for (Tree child : children) {
                child.accept(visitor);
            }
        }
    }

    static class TreeLeaf extends Tree {
        public TreeLeaf(int value, Color color, int depth) {
            super(value, color, depth);
        }

        public void accept(TreeVisitor visitor) {
            visitor.visitLeaf(this);
        }
    }

    abstract static class TreeVisitor {
        public abstract int getResult();
        public abstract void visitNode(TreeNode node);
        public abstract void visitLeaf(TreeLeaf leaf);
    }

    static class SumInLeavesVisitor extends TreeVisitor {
        private int result = 0;

        public int getResult() {
            return result;
        }

        public void visitNode(TreeNode node) {}

        public void visitLeaf(TreeLeaf leaf) {
            result += leaf.getValue();
        }
    }

    static class ProductOfRedNodesVisitor extends TreeVisitor {
        private long result = 1;
        private final int M = 1000000007;

        public int getResult() {
            return (int) result;
        }

        public void visitNode(TreeNode node) {
            if (node.getColor() == Color.RED) {
                result = (result * node.getValue()) % M;
            }
        }

        public void visitLeaf(TreeLeaf leaf) {
            if (leaf.getColor() == Color.RED) {
                result = (result * leaf.getValue()) % M;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, Color.RED, 0);
        TreeNode n1 = new TreeNode(7, Color.GREEN, 1);
        TreeLeaf l1 = new TreeLeaf(5, Color.RED, 2);
        TreeLeaf l2 = new TreeLeaf(12, Color.GREEN, 2);
        TreeLeaf l3 = new TreeLeaf(15, Color.RED, 1);

        n1.addChild(l1);
        n1.addChild(l2);
        root.addChild(n1);
        root.addChild(l3);

        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();

        root.accept(vis1);
        root.accept(vis2);

        System.out.println("Sum in Leaves: " + vis1.getResult());
        System.out.println("Product of Red Nodes: " + vis2.getResult());
    }
}

/*
OUTPUT:
Sum in Leaves: 32
Product of Red Nodes: 300
*/
