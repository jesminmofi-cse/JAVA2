import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first score:");
        double score1 = scanner.nextDouble();
        
        System.out.println("Enter the second score:");
        double score2 = scanner.nextDouble();
        
        System.out.println("Enter the third score:");
        double score3 = scanner.nextDouble();
        
        double average = (score1 + score2 + score3) / 3;
        char grade;
        
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.printf("The average score is: %.2f\n", average);
        System.out.println("The grade is: " + grade);
    }
}