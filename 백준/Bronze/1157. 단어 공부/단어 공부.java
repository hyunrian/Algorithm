import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];

        String string = scan.next().toUpperCase();

        //A~Z : 65~90
        for (int i = 0; i < string.length(); i++) {
            string.charAt(i);
            arr[string.charAt(i) - 65]++;
        }

        int max = 0;
        char ch = '?';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char)(i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}