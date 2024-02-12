import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.valueOf(br.readLine());

        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            char[] chars = s.toCharArray();
            int count = 0;

            for (int j = 0; j < chars.length; j++) {
                if (count < 0) {
                    break;
                }
                if (chars[j] == '(') {
                    count++;
                } else if (chars[j] == ')') {
                    count--;
                }
            }

            if (count == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}