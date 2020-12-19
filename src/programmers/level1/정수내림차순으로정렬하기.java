package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

public class 정수내림차순으로정렬하기 {
    public static long solution(long n){
        ArrayList<Long> al = new ArrayList<Long>();
        while (n > 0){
            al.add(n%10);
            n /= 10;
        }
        Collections.sort(al);
        long res = 0;
        for (int i=0;i<al.size();i++){
            res += al.get(i)*Math.pow(10, i);
        }
        return res;
    }

    public static void main(String[] args){
        solution(118372);
    }
}
