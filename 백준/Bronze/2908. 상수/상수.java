import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");
        int a = Integer.valueOf(new StringBuilder(split[0]).reverse().toString());
        int b = Integer.valueOf(new StringBuilder(split[1]).reverse().toString());

        System.out.println(a > b ? a : b);
    }
}