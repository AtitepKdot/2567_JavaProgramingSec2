import java.util.Scanner;

public class lab502 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner Input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Input number " + (i + 1) + " : ");
            nums[i] = Input.nextInt();
        }
        int sum = sumOfPos(nums);
        System.out.println("\nSummation of positive number is  " + sum);

        Input.close();
    }

    public static int sumOfPos(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }
}