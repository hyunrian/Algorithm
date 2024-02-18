import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= 9; j++) {
                map.put(i + " " + j, Integer.valueOf(st.nextToken()));
            }
        }

        Map.Entry<String, Integer> entry =
                map.entrySet().stream()
                .max(Map.Entry.comparingByValue()).get();

        System.out.println(entry.getValue() + "\n" + entry.getKey());
    }
}