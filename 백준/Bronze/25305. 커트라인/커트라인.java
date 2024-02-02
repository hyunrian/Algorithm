import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = scan.nextInt();
        int win = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        while (total-- > 0) {
            list.add(scan.nextInt());
        }

        list.sort(Comparator.reverseOrder());
        System.out.println(list.get(win - 1));
    }
}