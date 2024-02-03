import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        while (count > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a + b);
            count--;
        }
    }
}