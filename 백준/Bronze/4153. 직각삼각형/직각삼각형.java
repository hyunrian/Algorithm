import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int[] arr = new int[3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            for (int n : arr) {
                sum += n;
            }
            if (sum == 0) return;

            Arrays.sort(arr);
            int result = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) Math.pow(arr[i], 2);
            }
            if (arr[0] + arr[1] == arr[2]) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}