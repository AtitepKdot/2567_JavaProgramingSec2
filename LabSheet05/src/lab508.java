import javax.swing.JOptionPane;

public class lab508 {
     public static void main(String[] args) {
        int[] nums = { 25, 78, 41, 22, 36, 85, 37 };
        int index;

        String input = JOptionPane.showInputDialog("Input index of array: ");
        index = Integer.parseInt(input);

        while (true) {

            if (checkIndex(nums, index)) {
                break;
            } else {
                input = JOptionPane.showInputDialog(null, "Input index of array, agian:");
                index = Integer.parseInt(input);
            }
        }
        String message = "Current data, nums [" + index + "] is " + currentData(nums, index) + "\n";
        if(index==0){
        message += "No previous data\n";
        }
        else {message += "Previous data, nums[" + (index-1) + "] is "+ prevData(nums, index) + "\n";}  

        if(index==6){
            message += "No next data";
        }else{
        message += "Next data, nums[" + (index+1) + "] is "+ nextData(nums, index);}
        
        JOptionPane.showMessageDialog(null, message);
    }

    public static boolean checkIndex(int[] nums, int index) {
        return index >= 0 && index < nums.length;
    }

    public static int currentData(int[] nums, int index) {
        return nums[index];
    }

    public static int prevData(int[] nums, int index) {
        if (index > 0) {
            return nums[index - 1];
        } else {
            return -1;
        }
    }

    public static int nextData(int[] nums, int index) {
        if (index < nums.length - 1) {
            return nums[index + 1];
        } else {
            return -1;
        }
    }
}