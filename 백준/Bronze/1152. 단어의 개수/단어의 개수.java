import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine().trim();
        String[] sentences = sentence.split(" ");
        
        if (sentences[0].equals("") && sentences.length == 1) {
            System.out.println(0);
        } else {
            System.out.print(sentences.length);
        }
    }
}