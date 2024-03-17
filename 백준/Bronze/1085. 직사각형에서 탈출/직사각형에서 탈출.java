import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int width = getMinDistance(x, w);
        int height = getMinDistance(y, h);

        bw.write(String.valueOf(width <= height ? width : height));
        bw.close();
    }

    static int getMinDistance(int point, int end) {
        return Math.abs(point - end) <= point ? Math.abs(point - end) : point;
    }
}