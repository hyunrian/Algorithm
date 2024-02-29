import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] gaps = new int[N - 1];

        int prev = 0;
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(br.readLine());
            if (i > 0) {
                gaps[i - 1] = now - prev;
            }
            prev = now;
        }

        int gcd = gaps[0];
        for (int i = 0; i < gaps.length; i++) {
            gcd = gcd(gcd, gaps[i]);
        }

        int count = 0;
        for (int i = 0; i < gaps.length; i++) {
            if (gaps[i] > gcd) {
                count += (gaps[i] - gcd) / gcd;
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
    }

    static int gcd(int a, int b) {
        while (true) {
            int tmp = a;
            a = b;
            b = tmp % b;
            if (b == 0) return a;
        }
    }
}