import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.valueOf(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            char[] chars = br.readLine().toCharArray();
            ArrayList<Character> list = new ArrayList<>();
            char prev = ' ';

            for (int j = 0; j < chars.length; j++) {
                if (j == 0) {
                    if (chars.length == 1) {
                        count++;
                        break;
                    }
                    list.add(chars[0]);
                    prev = chars[0];
                }

                if (chars[j] != prev && !list.contains(chars[j])) {
                    if (j == chars.length - 1) {
                        count++;
                        break;
                    }
                    list.add(chars[j]);
                    prev = chars[j];
                } else if (chars[j] == prev && j == chars.length - 1) {
                    count++;
                } else if (chars[j] != prev && list.contains(chars[j])) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}