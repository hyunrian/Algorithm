import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int size = 9;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        
        int max = 0;
        int index = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        
        System.out.println(max);
        System.out.println(index + 1);
    }
}