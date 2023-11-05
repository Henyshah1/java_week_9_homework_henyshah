package Programs;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */
public class Programme_2_StudentMarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //While loop
        while (true) {
            System.out.print("Enter the student's name: ");
            String name = scanner.nextLine();

            System.out.print("Enter the student's roll number: ");
            int rollNumber = scanner.nextInt();

            System.out.print("Enter marks in Mathematics: ");
            int mathMarks = scanner.nextInt();

            System.out.print("Enter marks in Science: ");
            int scienceMarks = scanner.nextInt();

            System.out.print("Enter marks in English: ");
            int englishMarks = scanner.nextInt();

            int totalMarks = mathMarks + scienceMarks + englishMarks;
            double percentage = (totalMarks / 300.0) * 100;
            String result = (percentage >= 35) ? "Pass" : "Fail";

            // Determine the grade based on the average marks.
            String grade;
            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else {
                grade = "D";
            }

            System.out.println("-----------------------------");
            System.out.println("|                           |");
            System.out.println("|        Mark Sheet         |");
            System.out.println("|___________________________|");
            System.out.println("| Name:" + name + "                  |");
            System.out.println("| Roll No:" + rollNumber + "                |");
            System.out.println("|___________________________|");
            System.out.println("| Subjects: Marks           |");
            System.out.println("|___________________________|");
            System.out.println("| Math:" + mathMarks + "                   |");
            System.out.println("| Science:" + scienceMarks + "                |");
            System.out.println("| English:" + englishMarks + "                |");
            System.out.println("|___________________________|");
            System.out.println("| Total:" + totalMarks + "             |");
            System.out.println("|___________________________|");
            System.out.println("| Percentage:" + percentage + "           |");
            System.out.println("| Result:" + result + "               |");
            System.out.println("| Grade:" + grade + "                  |");
            System.out.println("|___________________________|");

           // Ask the user if they want to enter another student's data.
            System.out.print("\nDo you want to enter data for another student? (Y/N): ");
            char choice = scanner.next().charAt(0);

            if (choice != 'Y' && choice != 'y') {
                System.out.println("Program terminated.");
                break;
            }
            scanner.nextLine(); // Consume the newline character from the previous input.
        }

        scanner.close();
    }
}
