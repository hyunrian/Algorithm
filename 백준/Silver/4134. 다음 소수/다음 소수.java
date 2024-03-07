import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++) {
            long n = Long.parseLong(br.readLine());

            if (n <= 2) {
                bw.write(String.valueOf(2) + "\n");
                continue;
            }

            while (true) {
                boolean result = true;
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        result = false;
                        break;
                    }
                }

                if (result) {
                    bw.write(String.valueOf(n) + "\n");
                    break;
                }

                n++;
            }

        }
        bw.close();
    }
}