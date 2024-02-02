import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int testCount = scan.nextInt();
        int repeat = 0;
        String s = "";

        while (testCount-- > 0) {
            repeat = scan.nextInt();
            s = scan.next();

            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < repeat; j++) {
                    sb.append(s.charAt(i));
                }
            }
            System.out.println(sb);
            sb.setLength(0);
        }
        scan.close();
    }
}