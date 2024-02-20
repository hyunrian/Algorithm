import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger a = getValue();
        BigInteger b = getValue();

        bw.write(gcd(a, b));
        bw.close();
    }

    static BigInteger getValue() throws IOException {
        int N = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BigInteger val = new BigInteger("1");

        for (int i = 0; i < N; i++) {
            val = val.multiply(new BigInteger(st.nextToken()));
        }
        return val;
    }

    static String gcd(BigInteger a, BigInteger b) {
        while (b.compareTo(BigInteger.ZERO) > 0) {
            BigInteger temp = a;
            a = b;
            b = temp.remainder(b);
        }
        String result = a.toString();
        if (result.length() > 9) return result.substring(result.length() - 9);
        return result;
    }
}