import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String val = String.valueOf(sc.nextInt());

            if (val.equals("0")) return;

            String reverse = new StringBuilder(val).reverse().toString();

            if (val.equals(reverse)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}