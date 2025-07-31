import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student ID: ");
        String studentID = input.nextLine();

        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.println("Enter your course: ");
        String course = input.nextLine();

        System.out.println("Enter your section: ");
        String section = input.nextLine();

        System.out.println(" ");
        System.out.println("STUDENT INFORMATION");
        System.out.println("Student ID: " + studentID);
        System.out.println("Student name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        System.out.println(" ");
        System.out.println("Enter your midterm exam score: ");
        int midtermScore = input.nextInt();

        System.out.println("Enter your final exam score: ");
        int finalScore = input.nextInt();

        System.out.println("Enter your project score: ");
        int projectScore = input.nextInt();

        System.out.println("Enter your assignment score: ");
        int assignmentScore = input.nextInt();

        System.out.println(" ");
        System.out.println("STUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midtermScore);
        System.out.println("Final Exam Score: " + finalScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Assignment Score: " + assignmentScore);

        int allOverScore = midtermScore + finalScore + projectScore + assignmentScore;
        double averageScore = (allOverScore / 400.0) * 100;
        String remarks = "";

        if (averageScore >= 75){
            remarks = "PASSED";
        }
        else {
            remarks = "FAILED";
        }
        System.out.println(" ");
        System.out.println("Average Score: " + averageScore);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}