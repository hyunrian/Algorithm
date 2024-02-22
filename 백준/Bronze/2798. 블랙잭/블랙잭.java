import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            list.add(Integer.valueOf(st.nextToken()));
        }

        int result = 0;
        for (int i = 0; i < list.size() - 2; i++) {
            for (int j = i + 1; j < list.size() - 1; j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    int sum = list.get(i) + list.get(j) + list.get(k);
                    if (result < sum && sum <= M) {
                        result = sum;
                    }
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.close();
    }
}