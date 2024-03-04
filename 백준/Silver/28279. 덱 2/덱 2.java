import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<String> d = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String s = st.nextToken();

            switch (s) {
                case "1":
                    d.offerFirst(st.nextToken());
                    break;
                case "2":
                    d.offerLast(st.nextToken());
                    break;
                case "3":
                    if (d.isEmpty()) sb.append("-1\n");
                    else sb.append(d.pollFirst() + "\n");
                    break;
                case "4":
                    if (d.isEmpty()) sb.append("-1\n");
                    else sb.append(d.pollLast() + "\n");
                    break;
                case "5":
                    sb.append(d.size() + "\n");
                    break;
                case "6":
                    if (d.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "7":
                    if (d.isEmpty()) sb.append("-1\n");
                    else sb.append(d.peekFirst() + "\n");
                    break;
                case "8":
                    if (d.isEmpty()) sb.append("-1\n");
                    else sb.append(d.peekLast() + "\n");
            }
        }
        System.out.println(sb);
    }
}