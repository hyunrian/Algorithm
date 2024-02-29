class Solution {
    boolean solution(String s) {
        boolean answer = false;

        int empty = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') empty++;
            else empty--;

            if (empty < 0) break;
        }
        
        if (empty == 0) answer = true;

        return answer;
    }
}