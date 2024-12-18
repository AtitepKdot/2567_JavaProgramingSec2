import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input some sentence : ");
        String sentence = input.nextLine();

        while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = input.nextLine();
		}

        System.out.println("");
		
		String word = "";
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);


            if (currentChar == ' ') {
                if (!word.isEmpty()) {
                    System.out.println(word);
                    word = "";
                }
            } else {
                word += currentChar;
            }

        }

        if (!word.isEmpty()) {
            System.out.println(word);
        }

        input.close();
    }
}