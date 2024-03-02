import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> d = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String s = st.nextToken();

            switch (s) {
                case "push":
                    d.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (d.isEmpty()) bw.write("-1\n");
                    else bw.write(String.valueOf(d.pollFirst()) + "\n");
                    break;
                case "size":
                    bw.write(String.valueOf(d.size()) + "\n");
                    break;
                case "empty":
                    if (d.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "front":
                    if (d.isEmpty()) bw.write("-1\n");
                    else bw.write(String.valueOf(d.peekFirst()) + "\n");
                    break;
                case "back":
                    if (d.isEmpty()) bw.write("-1\n");
                    else bw.write(String.valueOf(d.peekLast()) + "\n");
            }
        }
        bw.close();
    }
}