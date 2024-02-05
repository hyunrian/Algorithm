import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String s = sc.next();

        char idx = 'a';
        char start = 'a';
        char end = 'z';

        for (int j = start; j <= end; j++) {
            sb.append(s.indexOf(idx) + " ");
            idx++;
        }
        System.out.println(sb);
    }
}