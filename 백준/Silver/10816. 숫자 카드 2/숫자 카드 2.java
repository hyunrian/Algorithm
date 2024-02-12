import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int key = Integer.valueOf(st.nextToken());
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int m = Integer.valueOf(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < m; i++) {
            int key = Integer.valueOf(st2.nextToken());
            int count = map.getOrDefault(key, 0);

            sb.append(count + " ");
        }
        System.out.println(sb);
    }
}