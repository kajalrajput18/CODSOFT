import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects of a student: ");
        int numSub = sc.nextInt();

        int[] marks = new int[numSub];
        int totalMarks = 0;

        
        for (int i = 0; i < numSub; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        // Calculating average percentage
        double avgPerc =  totalMarks / numSub;
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Average Percentage: \n", avgPerc);

        
        
        if (avgPerc >= 90) {
            System.out.println("Grade A");
        } else if (avgPerc >= 80) {
            System.out.println("Grade B");
        } else if (avgPerc >= 70) {
            System.out.println("Grade C");
        } else if (avgPerc >= 60) {
            System.out.println("Grade D");
        } else if (avgPerc >= 50) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }

        

        sc.close();
    }
}
