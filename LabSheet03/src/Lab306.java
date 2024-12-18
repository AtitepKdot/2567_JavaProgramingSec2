import java.util.Scanner;

public class Lab306 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scan.nextLine();

        String message = input.toLowerCase();

        if (message.indexOf("nichi")>=0) {
            System.out.println("Nichi is a sentence");
        } else {
            System.out.println(input);
        }

        scan.close();
    }
    
}