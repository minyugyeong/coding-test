package programmers.Lv0;

import java.util.Arrays;

// 중앙값 구하기
public class Solution_025 {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }

}
