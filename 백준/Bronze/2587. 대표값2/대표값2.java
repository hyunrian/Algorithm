import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }
        Collections.sort(list);
        int sum = 0;

        for (Integer num : list) {
            sum += num;
        }
        System.out.println(sum / 5);
        System.out.println(list.get(2));
    }
}