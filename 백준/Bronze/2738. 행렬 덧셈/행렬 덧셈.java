import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arrA = new int[N][M];
        int[][] arrB = new int[N][M];

        int turn = 2;
        while (turn > 0) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (turn == 2) arrA[i][j] = sc.nextInt();
                    if (turn == 1) arrB[i][j] = sc.nextInt();
                }
            }
            turn--;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(arrA[i][j] + arrB[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}