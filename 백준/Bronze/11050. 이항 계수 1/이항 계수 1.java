import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(getFactorial(N) / (getFactorial(N - K) * getFactorial(K)));
    }

    static int getFactorial(int n) {
        if (n == 0) return 1;
        return n * getFactorial(n - 1);
    }
}