import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.valueOf(br.readLine());

        while (n > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            while (st.hasMoreTokens()) {
                switch (st.nextToken()) {
                    case "push":
                        stack.push(Integer.valueOf(st.nextToken()));
                        break;
                    case "pop":
                        if (stack.empty()) bw.write("-1\n");
                        else bw.write(String.valueOf(stack.pop()) + "\n");
                        break;
                    case "size":
                        bw.write(String.valueOf(stack.size()) + "\n");
                        break;
                    case "empty":
                        if (stack.empty()) bw.write("1\n");
                        else bw.write("0\n");
                        break;
                    case "top":
                        if (stack.empty()) bw.write("-1\n");
                        else bw.write(String.valueOf(stack.lastElement()) + "\n");
                        break;
                }
            }
            n--;
        }
        bw.close();
    }
}