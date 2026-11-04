public class Week8_Task8_JavaFactoryPattern {
    interface Food {
        String getType();
    }

    static class Pizza implements Food {
        public String getType() {
            return "Someone ordered a Fast Food!";
        }
    }

    static class Cake implements Food {
        public String getType() {
            return "Someone ordered a Dessert!";
        }
    }

    static class FoodFactory {
        public Food getFood(String order) {
            if (order.equalsIgnoreCase("cake")) {
                return new Cake();
            } else if (order.equalsIgnoreCase("pizza")) {
                return new Pizza();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        Food food1 = foodFactory.getFood("cake");
        System.out.println("The factory returned " + food1.getClass());
        System.out.println(food1.getType());

        Food food2 = foodFactory.getFood("pizza");
        System.out.println("The factory returned " + food2.getClass());
        System.out.println(food2.getType());
    }
}

/*
OUTPUT:
The factory returned class Week8_Task8_JavaFactoryPattern$Cake
Someone ordered a Dessert!
The factory returned class Week8_Task8_JavaFactoryPattern$Pizza
Someone ordered a Fast Food!
*/
