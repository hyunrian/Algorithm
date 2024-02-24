import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a1 = Integer.valueOf(st.nextToken());
        int b1 = Integer.valueOf(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int a2 = Integer.valueOf(st.nextToken());
        int b2 = Integer.valueOf(st.nextToken());

        int a = a1 * b2 + a2 * b1;
        int b = b1 * b2;

        int d = gcd(a, b);
        bw.write(String.valueOf(a / d) + " " + String.valueOf(b / d));
        bw.close();
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}