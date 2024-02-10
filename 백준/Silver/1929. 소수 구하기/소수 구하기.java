import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int min = Integer.valueOf(s[0]);
        int max = Integer.valueOf(s[1]);

        for (int i = min; i <= max; i++) {
            if (i == 1) continue;
            if (prime(i)) bw.write(i + "\n");
        }
        bw.close();
    }

    static boolean prime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0)  return false;
        }
        return true;
    }
}