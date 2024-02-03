import java.util.*;

public class Main {

    static final int VAL = 45;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        int newHour = 0;
        int newMin = 0;

        if (min - VAL >= 0) {
            newHour = hour;
            newMin = min - VAL;
        } else {
            newHour = hour - 1;
            newMin = min + (60 - VAL);
            if (newHour < 0) {
                newHour += 24;
            }
        }

        System.out.println(newHour + " " + newMin);
    }
}