import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = br.readLine().toCharArray();
        int sec = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 'C') {
                sec += 3;
            } else if (chars[i] <= 'F') {
                sec += 4;
            } else if (chars[i] <= 'I') {
                sec += 5;
            } else if (chars[i] <= 'L') {
                sec += 6;
            } else if (chars[i] <= 'O') {
                sec += 7;
            } else if (chars[i] <= 'S') {
                sec += 8;
            } else if (chars[i] <= 'V') {
                sec += 9;
            } else if (chars[i] <= 'Z') {
                sec += 10;
            }
        }
        System.out.println(sec);
    }
}