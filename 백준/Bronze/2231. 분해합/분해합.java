import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String val = br.readLine();
        int n = Integer.valueOf(val);

        for (int i = 0; i <= 1000000; i++) {
            String s = String.valueOf(i);
            int sum = i;
            for (char c : s.toCharArray()) {
                sum += Character.getNumericValue(c);
            }

            if (sum == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}