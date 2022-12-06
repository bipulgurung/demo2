
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the marks of five subjects::\n");
        float sub1 = in.nextFloat();
        float sub2 = in.nextFloat();
        float sub3 = in.nextFloat();
        float sub4 = in.nextFloat();
        float sub5 = in.nextFloat();

        float total;
        float percentage;
        char grade;

        total = sub1 + sub2 + sub3 + sub4 + sub5;
        percentage = (float)((total / 500.0) * 100);

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 80 && percentage < 90)
            grade = 'B';
        else if (percentage >= 70 && percentage < 80)
            grade = 'C';
        else if (percentage >= 60 && percentage < 70)
            grade = 'D';
        else
            grade = 'E';

        System.out.println("\nThe Total marks   = " + total + "/500.0");
        System.out.println("The Percentage    = " + percentage + "%");
        System.out.println("The Grade         = '" + grade + "'");
    }
}