import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arrX = new String[3];
        String[] arrY = new String[3];
        HashMap<String, Integer> mapX = new HashMap<>();
        HashMap<String, Integer> mapY = new HashMap<>();

        for (int i = 0; i < arrX.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String x = st.nextToken();
            String y = st.nextToken();

            arrX[i] = x;
            arrY[i] = y;
            mapX.put(x, mapX.getOrDefault(x, 0) + 1);
            mapY.put(y, mapY.getOrDefault(y, 0) + 1);
        }

        for (String x : arrX) {
            if (mapX.get(x) == 1) {
                bw.write(x + " ");
            }
        }

        for (String y : arrY) {
            if (mapY.get(y) == 1) {
                bw.write(y);
            }
        }

        bw.close();
    }
}