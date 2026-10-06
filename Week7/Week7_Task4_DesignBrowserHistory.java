import java.util.ArrayList;
import java.util.List;

public class Week7_Task4_DesignBrowserHistory {
    private List<String> history = new ArrayList<>();
    private int currentIndex = 0;

    public Week7_Task4_DesignBrowserHistory(String homepage) {
        history.add(homepage);
    }

    public void visit(String url) {
        history = new ArrayList<>(history.subList(0, currentIndex + 1));
        history.add(url);
        currentIndex++;
    }

    public String back(int steps) {
        currentIndex = Math.max(0, currentIndex - steps);
        return history.get(currentIndex);
    }

    public String forward(int steps) {
        currentIndex = Math.min(history.size() - 1, currentIndex + steps);
        return history.get(currentIndex);
    }

    public static void main(String[] args) {
        Week7_Task4_DesignBrowserHistory browser = new Week7_Task4_DesignBrowserHistory("leetcode.com");

        browser.visit("google.com");
        browser.visit("facebook.com");
        browser.visit("youtube.com");

        System.out.println("Back 1: " + browser.back(1));
        System.out.println("Back 1: " + browser.back(1));
        System.out.println("Forward 1: " + browser.forward(1));

        browser.visit("linkedin.com");

        System.out.println("Forward 2: " + browser.forward(2));
        System.out.println("Back 2: " + browser.back(2));
    }
}

/*
OUTPUT:
Back 1: facebook.com
Back 1: google.com
Forward 1: facebook.com
Forward 2: linkedin.com
Back 2: google.com
*/
