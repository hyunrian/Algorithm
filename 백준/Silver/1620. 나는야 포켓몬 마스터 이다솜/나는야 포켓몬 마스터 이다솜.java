import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());

        HashMap<Integer, String> intToStringMap = new HashMap<>();
        HashMap<String, Integer> stringToIntMap = new HashMap<>();

        int num = 1;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            intToStringMap.put(num, s);
            stringToIntMap.put(s, num++);
        }

        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if ('1' <= s.charAt(0) && s.charAt(0) <= '9') {
                bw.write(intToStringMap.get(Integer.valueOf(s)) + "\n");
            } else {
                bw.write(stringToIntMap.get(s) + "\n");
            }
        }
        bw.close();
    }
}