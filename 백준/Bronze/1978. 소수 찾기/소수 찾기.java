import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j <= arr[i]; j++) {
                if (arr[i] % j == 0 && arr[i] != j) {
                    break;
                }
                if (arr[i] == j) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}