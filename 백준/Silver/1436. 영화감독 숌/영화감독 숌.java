import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());
        int val = 666;
        int count = 1;

        while (count != n) {
            val++;

            if (String.valueOf(val).contains("666")) {
                count++;
            }
        }
        System.out.println(val);
    }
}