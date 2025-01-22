import java.util.Scanner;

public class lab503 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length; i++) {
        System.out.print("Input number "+ (i+1) + " : ");
        String inputnum = input.nextLine();
        numbers[i] = Integer.parseInt(inputnum);
        }
        int count = 0;
        String oddNumbers = "";

        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
                oddNumbers += number + " ";
            }
        }
        System.out.println();

        System.out.println("There are " + count + " of odd number.");
        System.out.println("List of odd number : " + oddNumbers);
        
        input.close();  
    }
}