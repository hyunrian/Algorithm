import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long a = Long.valueOf(st.nextToken());
        long b = Long.valueOf(st.nextToken());

        bw.write(String.valueOf(a * b / gcb(a, b)));
        bw.close();
    }

    static long gcb(long a, long b) {
        if (b == 0) return a;
        return gcb(b, a % b);
    }
}