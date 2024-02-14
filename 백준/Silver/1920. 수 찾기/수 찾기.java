import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.valueOf(br.readLine());
        int[] arr = new int[n];
        int idx = 0;

        for (String s : br.readLine().split(" ")) {
            arr[idx] = Integer.valueOf(s);
            idx++;
        }
        Arrays.sort(arr);

        int m = Integer.valueOf(br.readLine());
        String[] split = br.readLine().split(" ");

        for (int i = 0; i < m; i++) {
            boolean result = binarySearch(arr, Integer.valueOf(split[i]));
            if (result) sb.append("1\n");
            else sb.append("0\n");
        }
        System.out.println(sb);
    }

    static boolean binarySearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}