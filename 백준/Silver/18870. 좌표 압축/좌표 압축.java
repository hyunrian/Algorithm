import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.valueOf(st.nextToken()));
        }

        ArrayList<Integer> copiedList = new ArrayList<>(list);
        List<Integer> sortedList = copiedList.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        HashMap<Integer, Integer> map = new HashMap<>();
        int order = 0;
        for (int val : sortedList) {
            map.put(val, order++);
        }

        for (int key : list) {
            bw.write(map.get(key) + " ");
        }
        bw.close();
    }
}