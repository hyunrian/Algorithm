import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] results = new String[sc.nextInt()];

        for (int i = 0; i < results.length; i++) {
            results[i] = sc.next();
        }
        sc.close();

        for (int i = 0; i < results.length; i++) {

            int cnt = 0;
            int sum = 0;

            for (int j = 0; j < results[i].length(); j++) {
                if (results[i].charAt(j) == 'X') {
                    cnt = 0;
                } else {
                    cnt++;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}