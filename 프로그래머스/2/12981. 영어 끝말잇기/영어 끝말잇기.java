import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {

        int person = 0;
        int turn = 0;

        char c = words[0].charAt(words[0].length() - 1);
        HashMap<String, Integer> map = new HashMap<>();
        map.put(words[0], 1);

        for (int i = 1; i < words.length; i++) {
            if (words[i].charAt(0) != c || map.containsKey(words[i])) {
                int order = i + 1;
                if (order % n != 0) {
                    person = order % n;
                    turn = order / n + 1;
                } else {
                    person = n;
                    turn = order / n;
                }
                break;
            }
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
            c = words[i].charAt(words[i].length() - 1);
        }

        return new int[] {person, turn};
    }
}