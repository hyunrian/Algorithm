import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.valueOf(br.readLine());

        final int QUARTER = 25;
        final int DIME = 10;
        final int NICKEL = 5;
        final int PENNY = 1;

        for (int i = 0; i < T; i++) {
            int change = Integer.valueOf(br.readLine());

            innerLoop:
            for (int j = change / QUARTER; j >= 0; j--) {
                for (int k = change / DIME; k >= 0; k--) {
                    for (int m = change / NICKEL; m >= 0; m--) {
                        for (int p = change / PENNY; p >= 0; p--) {
                            if ((j * QUARTER) + (k * DIME) + (m * NICKEL) + (p * PENNY) == change) {
                                bw.write(j + " " + k + " " + m + " " + p + "\n");
                                break innerLoop;
                            }
                        }
                    }
                }
            }
        }
        bw.close();
    }
}