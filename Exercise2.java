import java.util.Scanner;

public class Exercise2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        driving("Student");
        scan.close();
    }

    static void driving(String driver) {

        System.out.println("Testing!");
        drive(driver);

        String feedback = getFeedBack(driver);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            improveSkill(driver);

            // Recursive call
            driving(driver);
        } else if (feedback.equals("yes")) {
            lesson(driver);
        }
    }

    static void drive(String driver) {
        System.out.println("Driving!");
    }

    static String getFeedBack(String driver) {
        System.out.println("Is the " + driver + " good? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void improveSkill(String driver) {
        System.out.print("What skill do you want to improve?: ");
        String skill = scan.next();
        System.out.println("Taking Recommendation. Improving " + skill);
    }

    static void lesson(String driver) {
        System.out.println("Passed Driving ");
    }

}
