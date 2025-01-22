import java.util.Scanner;

public class lab505 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = { 78, 36, 58, 41, 25, 92, 75 };
        int index;

        System.out.print("Input index of array : ");
        index = input.nextInt();

        while (true) {
            if (index >= 0 && index < numbers.length) {
                break;
            } else {
                System.out.print("Input index of array, agian : ");
                index = input.nextInt();
            }
        }
        System.out.println();

        System.out.println("Value in current index is " + numbers[index]);
        if (index + 1 < numbers.length) {
            System.out.println("Value in next    index is " + numbers[index + 1]);
        } else {
            System.out.println("Sorry, 6 is the last index in array.");
        }

        input.close();
    }
}