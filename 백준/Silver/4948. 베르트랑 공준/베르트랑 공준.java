import java.io.*;

public class Main {
    static boolean[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) break;

            int count = 0;
            makePrime(2 * n);
            for (int i = n + 1; i < arr.length; i++) {
                if (!arr[i]) {
                    count++;
                }
            }
            bw.write(String.valueOf(count) + "\n");
        }
        bw.close();
    }

    static void makePrime(int n) {
        arr = new boolean[n + 1];

        if (n < 2) return;

        arr[0] = arr[1] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (arr[i]) continue;

            for (int j = i * i; j < arr.length; j = j + i) {
                if (j > n / 2) {
                    arr[j] = true;
                }
            }
        }
    }
}