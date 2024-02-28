import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        HashSet<String> set = new HashSet<>();

        String sum = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                sum += s.charAt(j);
                set.add(sum);
            }
            sum = "";
        }
        bw.write(String.valueOf(set.size()));
        bw.close();
    }
}