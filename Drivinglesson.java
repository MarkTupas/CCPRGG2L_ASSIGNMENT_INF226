import java.util.Scanner;

public class Drivinglesson {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Drive("student");
        scan.close();
    }

    static void Drive(String driver) {

        System.out.println("The " + driver + " is taking the test... ");
        taste(driver);

        String feedback = getFeedBack(driver);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            Addskill(driver);

            // Recursive call
            Drive(driver);
        } else if (feedback.equals("yes")) {
            Givelisence(driver);
        }
    }

    static void taste(String driver) {
        System.out.println("Checking performance");
    }

    static String getFeedBack(String driver) {
        System.out.println("Is the " + driver + " is good at driving? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void Addskill(String driver) {
        System.out.print("Give other skills to " + driver + ": ");
        String skill = scan.next();
        System.out.println("Adding skills. taking " + skill + " test...");
    }

    static void Givelisence(String driver) {
        System.out.println("Give the lisence to " + driver + ".");
    }
}