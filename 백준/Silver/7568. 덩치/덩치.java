import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());
        int[] weights = new int[n];
        int[] heights = new int[n];
        int[] orders = new int[n];
        Arrays.fill(orders, 1);

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            weights[i] = Integer.valueOf(s[0]);
            heights[i] = Integer.valueOf(s[1]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (weights[i] > weights[j] && heights[i] > heights[j]) {
                    orders[j]++;
                } else if (weights[i] < weights[j] && heights[i] < heights[j]) {
                    orders[i]++;
                } 
            }
        }
        for (int order : orders) {
            bw.write(order + " ");
        }
        bw.close();
    }
}