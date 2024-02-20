import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long lengthA = Long.valueOf(st.nextToken());
        long lengthB = Long.valueOf(st.nextToken());

        long length = gcd(lengthA, lengthB);
        for (int i = 0; i < length; i++) {
            bw.write("1");
        }
        bw.close();
    }

    static long gcd(long a, long b) {
        while (b > 0) {
            long tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}