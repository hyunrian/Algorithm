import java.io.*;
import java.util.LinkedHashSet;

public class Main {
    static LinkedHashSet<Integer> primes = new LinkedHashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            makePrime(N);
            sb.append(getCount(N) + "\n");
        }
        System.out.println(sb);
    }

    static void makePrime(int N) {
        boolean[] arr = new boolean[N]; // 0 ~ N-1
        arr[0] = arr[1] = true;

        for (int i = 2; i < Math.sqrt(N); i++) {
            if (arr[i]) continue;
            for (int j = i * i; j < arr.length; j += i) {
                arr[j] = true;
            }
        }
        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) primes.add(i);
        }
    }

    static int getCount(int N) {
        int count = 0;

        for (Integer a : primes) {
            int b = N - a;
            if (primes.contains(b) && b >= a) count++;
        }
        return count;
    }
}