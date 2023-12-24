import java.util.*;
import java.lang.*;
class Task2CodSoft {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of subjects");
        int TotalNumberOfSubjects = sc.nextInt();
        int TotalMarks = 0;
        for(int i = 1; i <= TotalNumberOfSubjects;i++){
            System.out.println("Subject "+ i + " Marks: ");
            int marks = sc.nextInt();
            TotalMarks += marks;
        }
        double AveragePercentage = (double)TotalMarks / (double) TotalNumberOfSubjects;
        System.out.println("Total Marks: " + TotalMarks);
        System.out.println("Average Percentage: " + AveragePercentage);
        if(AveragePercentage > 90){
            System.out.println("Grade Obtained: S");
        } else if (AveragePercentage > 80) {
            System.out.println("Grade Obtained: A+");
        } else if (AveragePercentage > 70) {
            System.out.println("Grade Obtained: A");
        } else if (AveragePercentage > 60) {
            System.out.println("Grade Obtained: B+");
        } else if (AveragePercentage > 50 ) {
            System.out.println("Grade Obtained: B");
        } else if (AveragePercentage < 50) {
            System.out.println("Grade Obtained: C");
        }else {
            System.out.println("REAPPEAR");
        }
    }
}
