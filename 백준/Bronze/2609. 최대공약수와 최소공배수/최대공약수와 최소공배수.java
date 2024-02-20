import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.valueOf(st.nextToken());
        int b = Integer.valueOf(st.nextToken());
        int d = gcd(a, b);
        System.out.println(d);
        System.out.println(a * b / d);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}