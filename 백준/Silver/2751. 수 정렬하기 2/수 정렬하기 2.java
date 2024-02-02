import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int length = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>(length);

        for (int i = 0; i < length; i++) {
            list.add(scan.nextInt());
        }

        Collections.sort(list);

        for (int val : list) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }
}