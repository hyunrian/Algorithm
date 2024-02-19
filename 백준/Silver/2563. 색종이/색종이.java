import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] arr = new boolean[100][100];
        int area = 0;
        int count = Integer.valueOf(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] split = br.readLine().split(" ");
            int x = Integer.valueOf(split[0]);
            int y = Integer.valueOf(split[1]);

            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        area++;
                    }
                }
            }
        }
        System.out.println(area);
    }
}