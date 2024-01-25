import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Step 1: Input Student registration number
            System.out.print("Enter Student registration number: ");
            String regNumber = scanner.nextLine();
            
            // Step 2: Input quiz score
            System.out.print("Enter quiz score: ");
            int quizScore = scanner.nextInt();
            if (quizScore > 10) {
                System.out.println("Invalid Input!");
                continue; // Go to Step 2
            }
            
            // Step 4: Input assignment score
            System.out.print("Enter assignment score: ");
            int assignmentScore = scanner.nextInt();
            if (assignmentScore > 10) {
                System.out.println("Invalid Input!");
                continue; // Go to Step 4
            }
            
            // Step 6: Input mid-term exam score
            System.out.print("Enter mid-term exam score: ");
            int midTermScore = scanner.nextInt();
            if (midTermScore > 20) {
                System.out.println("Invalid Input!");
                continue; // Go to Step 6
            }
            
            // Step 8: Input final exam score
            System.out.print("Enter final exam score: ");
            int finalExamScore = scanner.nextInt();
            if (finalExamScore > 60) {
                System.out.println("Invalid Input!");
                continue; // Go to Step 8
            }
            
            // Step 10: Compute grade
            int totalScore = quizScore + assignmentScore + midTermScore + finalExamScore;
            String grade = (totalScore > 55) ? "Pass" : "Fail";
            System.out.println("Grade: " + grade);
            
            // Step 11: Process next student grade or end
            System.out.print("Do you want to process another student grade? (yes/no): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("yes")) {
                break; // End of program
            }
            scanner.nextLine(); // Consume newline
        }
        
        scanner.close();
        System.out.println("End of program.");
    }
}
