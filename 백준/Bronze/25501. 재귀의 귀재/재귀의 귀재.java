import java.io.*;

public class Main {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String s = br.readLine();
            count = 0;
            sb.append(isPalindrome(s)).append(" ").append(count).append("\n");
        }
        System.out.println(sb);
    }

    static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    static int recursion(String s, int f, int e) {
        count++;
        if (f >= e) return 1;
        else if (s.charAt(f) != s.charAt(e)) return 0;
        else return recursion(s, f + 1, e - 1);
    }
}