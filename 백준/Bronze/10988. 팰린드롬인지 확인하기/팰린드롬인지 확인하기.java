import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String reverse = new StringBuilder(s).reverse().toString();

        if (s.equals(reverse)) System.out.println(1);
        else System.out.println(0);
    }
}