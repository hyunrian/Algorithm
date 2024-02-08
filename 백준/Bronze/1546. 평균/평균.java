import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Double[] arr = new Double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Double.valueOf(sc.nextInt());
        }

        Double max = Arrays.stream(arr)
                .max(Double::compareTo)
                .orElse(0.0);

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / max * 100;
        }

        double result = Arrays.stream(arr)
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println(result);
    }
}