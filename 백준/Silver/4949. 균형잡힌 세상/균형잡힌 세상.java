import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String s = br.readLine();
            if (s.equals(".")) break;
            bw.write(getResult(s) + "\n");
        }
        bw.close();
    }

    private static String getResult(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') return "no";
                else stack.pop();
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') return "no";
                else stack.pop();
            }
        }

        if (stack.isEmpty()) return "yes";
        else return "no";
    }
}