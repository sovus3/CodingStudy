public class YearningScore {
    public static void main(String[] args) {
        String name[] = { "may", "kein", "kain", "radi" };
        int yearning[] = { 5, 10, 1, 3 };
        String photo[][] = {{ "may", "kein", "kain", "radi"},
                            { "may", "kein", "brin", "deny"},
                            { "kon", "kain", "may", "coni" }};

        Solution s = new Solution();
        int answer[] = s.solution(name, yearning, photo);

        System.out.print("[");
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
            if(i != answer.length - 1)
                System.out.print(",");
            else
                System.out.print("");

        }
        System.out.println("]");
    }
}

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int i, j, k;
        int answer[] = new int[photo.length];

        for(i = 0; i < photo.length; i++){
            for(j = 0; j < name.length; j++){
                for(k = 0; k < photo[i].length; k++){
                    if(name[j] == (photo[i][k])){
                        answer[i] += yearning[j]; 
                    }
                }
            }
        }
        return answer;
    }
}
