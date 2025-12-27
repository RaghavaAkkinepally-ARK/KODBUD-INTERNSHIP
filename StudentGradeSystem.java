import java.util.Scanner;

class Student {

    String name;
    int[] marks = new int[3];

    // Calculate average marks
    double calculateAverage() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total / 3.0;
    }

    // Decide grade based on average
    char calculateGrade(double average) {
        if (average >= 75) {
            return 'A';
        } else if (average >= 60) {
            return 'B';
        } else if (average >= 40) {
            return 'C';
        } else {
            return 'F';
        }
    }
}

public class StudentGradeSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student name: ");
        student.name = sc.nextLine();

       
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            student.marks[i] = sc.nextInt();
        }

        double average = student.calculateAverage();
        char grade = student.calculateGrade(average);

        // Display report
        System.out.println("\n--- Student Report ---");
        System.out.println("Name    : " + student.name);
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + grade);

        sc.close();
    }
}
