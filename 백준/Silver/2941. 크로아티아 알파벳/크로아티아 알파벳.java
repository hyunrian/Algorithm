import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = br.readLine().toCharArray();
        int length = 0;

        for (int i = 0; i < chars.length; i++) {
            try {
                switch (chars[i]) {
                    case 'c':
                        if (chars[i + 1] == '=' || chars[i + 1] == '-') i++;
                        break;
                    case 'd':
                        if (chars[i + 1] == 'z' && chars[i + 2] == '=') i += 2;
                        else if (chars[i + 1] == '-') i++;
                        break;
                    case 'l':
                        if (chars[i + 1] == 'j') i++;
                        break;
                    case 'n':
                        if (chars[i + 1] == 'j') i++;
                        break;
                    case 's':
                        if (chars[i + 1] == '=') i++;
                        break;
                    case 'z':
                        if (chars[i + 1] == '=') i++;
                        break;
                }
            } catch (Exception e) {
            } finally {
                length++;
            }
        }
        System.out.println(length);
    }
}