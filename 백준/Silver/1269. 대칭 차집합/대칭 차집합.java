import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        HashSet<Integer> setA = getSet(a, st);

        st = new StringTokenizer(br.readLine(), " ");
        HashSet<Integer> setB = getSet(b, st);

        int sizeA = setA.size();
        for (Integer val : setB) {
            if (setA.contains(val)) {
                sizeA--;
            }
        }

        int sizeB = setB.size();
        for (Integer val : setA) {
            if (setB.contains(val)) {
                sizeB--;
            }
        }

        bw.write(String.valueOf(sizeA + sizeB));
        bw.close();
    }

    static HashSet<Integer> getSet(int count, StringTokenizer st) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < count; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        return set;
    }
}