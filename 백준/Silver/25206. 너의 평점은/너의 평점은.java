import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double creditSum = 0;
        double totalSum = 0;

        for (int i = 0; i < 20; i++) {
            String[] split = br.readLine().split(" ");
            double credit = Double.valueOf(split[1]);
            double grade = 0.0;

            switch (split[2]) {
                case "A+":
                    grade = 4.5;
                    break;
                case "A0":
                    grade = 4.0;
                    break;
                case "B+":
                    grade = 3.5;
                    break;
                case "B0":
                    grade = 3.0;
                    break;
                case "C+":
                    grade = 2.5;
                    break;
                case "C0":
                    grade = 2.0;
                    break;
                case "D+":
                    grade = 1.5;
                    break;
                case "D0":
                    grade = 1.0;
                    break;
            }
            if (!split[2].equals("P")) {
                creditSum += credit;
                totalSum += credit * grade;
            }
        }
        System.out.println(totalSum / creditSum);
    }
}