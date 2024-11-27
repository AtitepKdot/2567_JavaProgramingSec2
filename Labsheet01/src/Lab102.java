import java.util.Scanner;

import javax.swing.*;
public class Lab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Input number of minutes: ");
		int minute = input.nextInt();
		int hour = minute/60;
		int day = hour/24;
		int year = day/365;
		int dayAmount = day % 365;
		System.out.println(minute +" minute is approximately" + year + "years and " + (dayAmount) + "days" );
	
		
	}

}
