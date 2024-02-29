class Solution {
    public int solution(String s) {
        int answer = 1;
        char x = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (count == 0) {
                answer++;
                x = s.charAt(i);
            }

            if (s.charAt(i) == x) count++;
            else count--;
        }
        return answer;
    }
}