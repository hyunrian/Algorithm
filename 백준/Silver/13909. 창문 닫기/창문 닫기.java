import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        
        while (true) {
            if (Math.pow(count, 2) <= N && N < Math.pow(count + 1, 2)) break;
            else count++;
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}