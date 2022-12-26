import java.util.ArrayList;
import java.util.Arrays;

class CafeUtil {

    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double a : prices) {
            total += a;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + ": " + menuItems.get(i));
        }
        // System.out.println(menuItems);

    }

    public void addCustomer(ArrayList<String> customers) {

        System.out.println("Please enter your name:");

        String userName = System.console().readLine();
        customers.add(userName);

        System.out.println(
                "Hello " + userName + "!" + " There are " + customers.indexOf(userName) + " people in front of you.");
        System.out.println(customers);
        // System.out.println("Hello " + userName + "!" + " There are "+
        // customers.size() + " people in front of you.");
    }
}
