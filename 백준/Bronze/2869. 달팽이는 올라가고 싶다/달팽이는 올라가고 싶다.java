import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.valueOf(st.nextToken());
        int B = Integer.valueOf(st.nextToken());
        int V = Integer.valueOf(st.nextToken());

        double day = (V - B) / (double)(A - B); // n * A - (n - 1) * B >= V
        if ((V - B) % (A - B) != 0) {
            day += 1;
        }
        bw.write(String.valueOf((int)day));
        bw.close();
    }
}