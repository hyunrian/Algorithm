import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        while (count-- > 0) {
            list.add(scan.nextInt());
        }

        Collections.sort(list);
        System.out.println(list.get(0) + " " + list.get(list.size() - 1));
    }
}