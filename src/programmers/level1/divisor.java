package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class divisor {
    public static ArrayList<Integer> solution(int[] arr, int divisor){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i=0;i<arr.length;i++){
            if (arr[i]%divisor == 0){
                ans.add(arr[i]);
            }
        }
        if (ans.size() == 0){
            ans.add(-1);
        }
//        오름차순
        Collections.sort(ans);
//        내림차순
        Collections.sort(ans, new AscendingInteger());
        return ans;
    };

    public static void main(String[] args){
        int[] arr = {5, 9, 7, 10};
        System.out.println(solution(arr, 5));
    }
}

// String : Integer -> String
class AscendingInteger implements Comparator<Integer>{
    @Override
    public int compare(Integer a, Integer b){
        return b.compareTo(a);
    }
}
