
import java.util.Scanner;

public class lab504 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] scores = new double[5];
        double total = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Input score of student " + (i + 1) + ": ");
            scores[i] = input.nextDouble();
            total += scores[i];
        }
        System.out.println();

        double average = total / scores.length;

        System.out.println("Average of 5 student is " + average);
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > average) {
                System.out.println("Student " + (i + 1) + " (Score: " + scores[i] + ")");
            }
        }
        input.close();
    }
}
