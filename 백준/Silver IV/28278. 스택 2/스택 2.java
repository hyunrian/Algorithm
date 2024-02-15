import java.io.*;
import java.util.ArrayList;

public class Main {

    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.valueOf(br.readLine());

        while (N-- > 0) {
            String[] split = br.readLine().split(" ");

            switch (split[0]) {
                case "1":
                    push(split[1]);
                    break;
                case "2":
                    sb.append(pop() + "\n");
                    break;
                case "3":
                    sb.append(size() + "\n");
                    break;
                case "4":
                    sb.append(isEmpty() + "\n");
                    break;
                case "5":
                    sb.append(top() + "\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    static void push(String x) {
        list.add(x);
    }

    static String pop() {
       if (list.isEmpty()) {
           return "-1";
       } else {
           int index = list.size() - 1;
           String val = list.get(index);
           list.remove(index);
           return val;
       }
    }

    static int size() {
        return list.size();
    }

    static int isEmpty() {
        return list.isEmpty() ? 1 : 0;
    }

    static String top() {
        return list.isEmpty() ? "-1" : list.get(list.size() - 1);
    }
}