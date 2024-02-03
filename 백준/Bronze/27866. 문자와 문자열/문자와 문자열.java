import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int index = scan.nextInt();
        System.out.println(s.charAt(index - 1));
    }
}