import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int submit = 28;
        boolean[] arr = new boolean[30];
        while (submit-- > 0) {
            int num = Integer.parseInt(br.readLine());
            arr[num - 1] = true;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) bw.write(i + 1 + "\n");
        }
        bw.close();
    }
}