import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int[] arr = new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;

            Arrays.sort(arr);

            int same = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) same++;
                }
            }

            if (arr[0] + arr[1] > arr[2]) {
                if (same == 3) bw.write("Equilateral\n");
                else if (same == 1) bw.write("Isosceles\n");
                else bw.write("Scalene\n");
            } else {
                bw.write("Invalid\n");
            }
        }
        bw.close();
    }
}