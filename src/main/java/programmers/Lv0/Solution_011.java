package programmers.Lv0;

public class Solution_011 {
    public double solution(int[] numbers) {
        double answer = 0;

        for(int n : numbers){
            answer += n;
        }

        return answer / numbers.length;
    }
}
