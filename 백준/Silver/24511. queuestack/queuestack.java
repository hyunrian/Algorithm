import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); //queuestack 개수

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        Deque<String> d = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String stackOrQueue = st1.nextToken();
            String val = st2.nextToken();
            if (stackOrQueue.equals("0")) {
                d.offer(val); //queue인 경우에만 deque에 넣음
            }
        }

        int M = Integer.parseInt(br.readLine()); //queuestack에 삽입할 원소의 수
        st1 = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            d.offerFirst(st1.nextToken());
            sb.append(d.pollLast()).append(" ");
        }
        System.out.println(sb);
    }
}