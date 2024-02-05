import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int height = sc.nextInt();
            int width = sc.nextInt();
            int n = sc.nextInt();

            int total = height * width;
            ArrayList<String> list = new ArrayList<>();

            int y = 1;
            int x = 1;
            
            for (int j = 0; j < total; j++) {
                String room = y + (x < 10 ? "0" : "") + x;
                list.add(room);
                y++;
                if (y > height) {
                    y = 1;
                    x++;
                }
            }
            System.out.println(list.get(n - 1));
        }
    }
}