import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String el = st.nextToken();

            if (el.equals("enter")) set.add(name);
            else set.remove(name);
        }
        
        ArrayList<String> list = new ArrayList<>(set);
        list.sort(Comparator.reverseOrder());
        for (String s : list) {
            bw.write(s + "\n");
        }
        bw.close();
    }
}