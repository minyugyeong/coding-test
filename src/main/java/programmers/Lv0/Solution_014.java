package programmers.Lv0;

public class Solution_014 {
    public String solution(String my_string) {
        String answer = "";

        for(int i = my_string.length() - 1; i >= 0; i--){
            answer += my_string.charAt(i);
        }

        return answer;
    }

    public String goodSolution(String my_string){
        StringBuilder sb = new StringBuilder();
        String answer = sb.append(my_string).reverse().toString();

        return answer;
    }
}
