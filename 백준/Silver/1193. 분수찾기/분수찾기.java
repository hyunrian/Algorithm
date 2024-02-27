import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());

        if (X == 1) bw.write("1/1");
        else {
            int sum = 1;
            for (int i = 1; i <= X; i++) {
                sum += i;
                int start = sum;
                int end = sum + i;
                if (start <= X && X <= end) {
                    int cPlusP = i + 2;

                    if (cPlusP % 2 == 0) {
                        int c = cPlusP - 1 - (X - start);
                        int p = cPlusP - c;
                        bw.write(String.valueOf(c) + "/" + String.valueOf(p));
                        break;
                    } else {
                        int p = cPlusP - 1 - (X - start);
                        int c = cPlusP - p;
                        bw.write(String.valueOf(c) + "/" + String.valueOf(p));
                        break;
                    }
                }
            }
        }
        bw.close();
    }
}