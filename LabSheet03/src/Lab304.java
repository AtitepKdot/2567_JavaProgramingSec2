import java.util.*;
public class Lab304 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Full Name: ");
        String name = input.nextLine();

        int space = name.indexOf(" ");

        if (space == -1) {
            System.out.println("Incorrect Name");
        }
        else{
            String fName = name.substring(0, space);
            String lName = name.substring(space + 1);

            System.out.println("First Name: " + fName.toUpperCase());
            System.out.println("Last Name: " + lName.toLowerCase());
        }

        input.close();
    }
}