import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            list.add(sc.nextInt());
        }

        ArrayList<Integer> ascList = new ArrayList<>(list);
        ArrayList<Integer> descList = new ArrayList<>(list);
        Collections.sort(ascList);
        Collections.sort(descList, Comparator.reverseOrder());

        String print = "";

        if (Arrays.equals(list.toArray(), ascList.toArray())) {
            print = "ascending";
        } else if (Arrays.equals(list.toArray(), descList.toArray())) {
            print = "descending";
        } else {
            print = "mixed";
        }

        System.out.println(print);
    }
}