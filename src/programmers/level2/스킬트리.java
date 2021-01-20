package programmers.level2;

public class 스킬트리 {
    public static int solution(String skill, String[] skill_trees){
        int cnt = 1;
        int[] order = new int[26];
        for (int i=0;i<skill.length();i++){
            int k = (int)skill.charAt(i) - 65;
            order[k] = cnt++;
        }
        int res = 0;
        for (int i=0;i<skill_trees.length;i++){
            boolean flag = false;
            int x = 1;
            String tree = skill_trees[i];
            for (int j=0;j<tree.length();j++){
                int y = (int)tree.charAt(j) - 65;
                if (order[y] == 0 || order[y] == x){
                    if (order[y] == x) x++;
                } else {
                    flag = true;
                    break;
                }
            }
            if (!flag){
                res++;
            }
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args){
        String[] skills_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        solution("CBD", skills_trees);
    }
}
