import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> d = new ArrayDeque<>();
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            d.offer(i + 1);
        }
        sb.append("1 ");

        int poll = d.poll();
        int move = arr[0];
        while (!d.isEmpty()) {
            if (move > 0) {
                for (int i = 1; i < move; i++) {
                    d.offer(d.poll());
                }
                poll = d.poll();
            } else if (move < 0) {
                for (int i = 1; i < -move; i++) {
                    d.offerFirst(d.pollLast());
                }
                poll = d.pollLast();
            }
            move = arr[poll - 1];
            sb.append(poll).append(" ");
        }
        System.out.println(sb);
    }
}