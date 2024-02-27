package programmers.Lv0;

public class Solution_017 {
    public int solution(int[] array, int height) {
        int answer = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > height) answer ++;
        }

        return answer;
    }
}
