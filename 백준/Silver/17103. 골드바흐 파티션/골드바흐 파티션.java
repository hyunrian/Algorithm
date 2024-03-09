import java.io.*;

public class Main {
    static boolean[] arr = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        makePrime();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            for (int i = 2; i <= N / 2; i++) {
                if (!arr[i] && !arr[N - i]) count++;
            }
            sb.append(count + "\n");
        }
        System.out.println(sb);
    }

    static void makePrime() {
        arr[0] = arr[1] = true;

        for (int i = 2; i <= Math.sqrt(arr.length - 1); i++) {
            if (arr[i]) continue;
            for (int j = i * i; j < arr.length; j += i) {
                arr[j] = true;
            }
        }
    }
}