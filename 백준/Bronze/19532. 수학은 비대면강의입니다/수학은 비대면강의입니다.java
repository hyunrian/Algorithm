import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = {"a", "b", "c", "d", "e", "f"};
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 6; i++) {
            map.put(arr[i], Integer.valueOf(st.nextToken()));
        }

        int x = 0;
        int y = 0;

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (map.get("a") * i + map.get("b") * j == map.get("c")
                        && map.get("d") * i + map.get("e") * j == map.get("f")) {
                    x = i;
                    y = j;
                }
            }
        }
        bw.write(String.valueOf(x) + " " + String.valueOf(y));
        bw.close();
    }
}