import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }

        int order = 1;
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            if (queue.peek() == order) {
                queue.poll();
                order++;
            } else if (!stack.isEmpty() && stack.peek() == order) {
                stack.pop();
                order++;
            } else  {
                stack.push(queue.poll());
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == order) {
                stack.pop();
                order++;
            } else {
                break;
            }
        }

        if (stack.isEmpty()) bw.write("Nice");
        else bw.write("Sad");

        bw.close();
    }
}