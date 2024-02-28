package programmers.Lv0;

public class Solution_021 {
    public int solution(int slice, int n) {
        return n % slice != 0 ? n / slice + 1 : n / slice;
    }
}
