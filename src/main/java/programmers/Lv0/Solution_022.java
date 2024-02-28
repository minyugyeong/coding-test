package programmers.Lv0;

public class Solution_022 {
    public int solution(int n) {
        int slice = 7;

        if(n <= slice) return 1;
        else if(n % slice > 0) return n / slice + 1;
        else return n / slice;
    }
}
