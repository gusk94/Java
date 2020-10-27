package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

public class 두개뽑아서더하기 {
    public static int[] solution(int[] numbers){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                int num = numbers[i] + numbers[j];
                boolean flag = false;
                for (int k=0;k<res.size();k++){
                    if (res.contains(num)){
                        flag = true;
                        break;
                    }
                }
                if (!flag) res.add(numbers[i]+numbers[j]);
            }
        }
        Collections.sort(res);
        int[] ans = new int[res.size()];
        for (int i=0;i<res.size();i++){
            ans[i] = res.get(i);
        }
        return ans;
    }

    public static void main(String[] args){
        int[] numbers = {2, 1, 3, 4, 1};
        System.out.println(solution(numbers));
    }
}
