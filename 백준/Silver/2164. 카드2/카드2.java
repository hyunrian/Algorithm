import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> d = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            d.offer(i);
        }

        while (d.size() > 1) {
            d.poll();
            d.offer(d.poll());
        }
        bw.write(String.valueOf(d.peek()));
        bw.close();
    }
}