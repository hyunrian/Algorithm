import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int line = scan.nextInt();
        int space = line - 1;

        for (int i = 0; i < line; i++) {
            while (space > 0) {
                sb.append(" ");
                space--;
            }
            for (int j = 0; j < i + 1; j++) {
                sb.append("*");
            }
            sb.append("\n");
            space = line - (i + 2);
        }
        System.out.println(sb);
    }
}