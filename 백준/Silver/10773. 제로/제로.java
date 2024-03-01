import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n != 0) list.add(n);
            else list.remove(list.size() - 1);
        }

        int sum = 0;
        for (Integer n : list) {
            sum += n;
        }
        bw.write(String.valueOf(sum));
        bw.close();
    }
}