import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(getResult(Integer.parseInt(br.readLine())));
    }

    static int getResult(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return getResult(N - 1) + getResult(N - 2);
    }
}