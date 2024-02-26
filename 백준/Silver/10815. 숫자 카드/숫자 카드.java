import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(st.nextToken(), "1");
        }

        int M = Integer.valueOf(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            bw.write(map.getOrDefault(st.nextToken(), "0") + " ");
        }
        bw.close();
    }
}