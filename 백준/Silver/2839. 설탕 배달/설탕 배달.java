import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.valueOf(br.readLine());
        int minCount = 1667;

        for (int i = 0; i <= N/5; i++) {
            for (int j = 0; j <= N/3; j++) {
                if (5 * i + 3 * j == N) {
                    minCount = Math.min(minCount, i + j);
                }
            }
        }
        if (minCount == 1667) bw.write("-1");
        else bw.write(String.valueOf(minCount));
        bw.close();
    }
}