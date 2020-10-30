package programmers.level1;

public class 수박수박 {
    public static StringBuffer solution(int n){
        int i = 0;
        StringBuffer res = new StringBuffer();
        while (i < n){
            if (i%2 == 0) res.append("수");
            else res.append("박");
            i++;
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(solution(3));
    }
}
