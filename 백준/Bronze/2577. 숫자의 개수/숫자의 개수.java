import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        int result = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            result *= arr[i];
        }

        String s = String.valueOf(result);
        int[] nums = new int[10];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i == Character.getNumericValue(s.charAt(j))) {
                    nums[i]++;
                }
            }
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }
}