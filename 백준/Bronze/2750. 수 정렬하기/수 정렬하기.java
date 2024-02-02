import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int length = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>(length);

        while (length-- > 0) {
            list.add(scan.nextInt());
        }

        Collections.sort(list);

        for (int i : list) {
            sb.append(i + "\n");
        }

        System.out.println(sb);
    }
}