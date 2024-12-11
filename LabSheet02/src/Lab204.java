
import java.util.*;
public class Lab204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input value of X : ");
		int xInput = input.nextInt();
		System.out.print("Input value of Y : ");
		int yInput = input.nextInt();
		while (yInput <= xInput) {
			System.out.print("Input vaue of Y, again : ");
			yInput = input.nextInt();
			
		}
		System.out.println("");
		int sum = xInput;
		
		for (int i = xInput + 1; i <= yInput; i++) {
            int summ = sum;
            sum += i;
            System.out.println(summ + " + " + i + " = " + sum);
        }
        
	}

}