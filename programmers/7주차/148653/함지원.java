class Solution {
    public int solution(int storey) {
        int answer = 0;

        while (storey > 0) {
            int digit = storey % 10;
            int next = storey / 10;

            if (digit > 5 || (digit == 5 && next % 10 >= 5)) {
                answer += (10 - digit);
                storey = next + 1;
            } else {
                answer += digit;
                storey = next;
            }
        }

        return answer;
    }
}
