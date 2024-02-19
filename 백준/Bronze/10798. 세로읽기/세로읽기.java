import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, String> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            map.put(i, s);
            if (s.length() > max) max = s.length();
        }
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                String s = map.get(j);
                if (s.length() < max && i >= s.length()) sb.append("");
                else sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}