package programmers.Lv0;

import java.util.Arrays;

public class Solution_023 {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(s -> s * 2).toArray();
    }
}
