import java.util.*;

public class Generate_Parentheses_22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        String str = new String();
        helper(str, 0,0,n,res);
        return res;
    }

    public void helper(String str, int left, int right, int n, List<String> res){
        if (right == n){
            res.add(str);

            return ;
        }
        else {
            if (left < n) {
                helper(str+ "(", left + 1, right, n, res);
            }
            if (left > right) {
                helper(str+")", left, right + 1, n, res);
            }
        }

    }

    public static void main(String[] args) {
        Generate_Parentheses_22 gp = new Generate_Parentheses_22();
        List<String > res = gp.generateParenthesis(4);

        for(int i=0; i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
