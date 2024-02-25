import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.valueOf(br.readLine());
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        list.sort(Comparator.comparingInt((String s) -> Integer.valueOf(s.split(" ")[1]))
                .thenComparing(s -> Integer.valueOf(s.split(" ")[0])));

        for (String s : list) {
            bw.write(s + "\n");
        }
        bw.close();
    }
}