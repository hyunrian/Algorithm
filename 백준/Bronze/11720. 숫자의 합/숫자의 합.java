import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        char[] chars = scan.next().toCharArray();
        
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += Character.getNumericValue(chars[i]);
        }
        System.out.println(sum);
    }
}