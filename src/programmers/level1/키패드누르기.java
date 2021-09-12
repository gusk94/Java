package programmers.level1;

public class 키패드누르기 {
    public static String solution(int[] numbers, String hand){
        StringBuffer ans = new StringBuffer();
        int left = 10;
        int right = 10;
        int[][] loc = {{0, 0, 3, 0, 0, 2, 0, 0, 1}, {4, 0, 1, 0, 0, 2, 0, 0, 3}, {3, 0, 0, 0, 0, 1, 0, 0, 2}, {4, 0, 1, 0, 0, 2, 0, 0, 3}, {3, 0, 2, 0, 0, 1, 0, 0, 2}, {2, 0, 1, 0, 0, 0, 0, 0, 1}, {3, 0, 2, 0, 0, 1, 0, 0, 2}, {2, 0, 3, 0, 0, 2, 0, 0, 1}, {1, 0, 2, 0, 0, 1, 0, 0, 0}, {2, 0, 3, 0, 0, 2, 0, 0, 1}, {1, 0, 4, 0, 0, 3, 0, 0, 2}};
        for (int i=0;i<numbers.length;i++){
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                ans.append("L");
                left = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                ans.append("R");
                right = numbers[i];
            } else {
                if (loc[left][numbers[i]] > loc[right][numbers[i]]){
                    ans.append("R");
                    right = numbers[i];
                } else if (loc[left][numbers[i]] < loc[right][numbers[i]]){
                    ans.append("L");
                    left = numbers[i];
                } else{
                    if (hand.equals("right")){
                        ans.append("R");
                        right = numbers[i];
                    }else{
                        ans.append("L");
                        left = numbers[i];
                    }
                }
            }
        }
        String res = ans.toString();
        return res;
    }

    public static void main(String[] args){
//        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        System.out.println(solution(numbers, hand));
    }
}
