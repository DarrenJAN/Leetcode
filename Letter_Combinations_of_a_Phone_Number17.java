import java.util.*;


public class Letter_Combinations_of_a_Phone_Number17 {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        Map<Character, String> map = new HashMap<>() {
            {
                put('2',"abc");put('3',"def");put('4',"ghi");put('5',"jkl");
                put('6',"mno");put('7',"pqrs");put('8',"tuv");put('9',"wxyz");

            }
        };

        int length = digits.length();
        if(length ==0) return res;

        StringBuilder sb = new StringBuilder();
        helper(res,0,digits,sb,map);



        return res;
    }

    private void helper(List<String> res, int index, String digits, StringBuilder sb, Map<Character, String> map){
        if(index == digits.length()){
            res.add(sb.toString());
            return;
        }

        String str = map.get(digits.charAt(index));
        for(int i =0;i<str.length();i++){
            sb.append(str.charAt(i));
            helper(res, index+1, digits, sb, map);
            sb.setLength(sb.length() - 1); // ****************important************** 删除最后一位
        }
    }


    public static void main(String[] args) {
        Letter_Combinations_of_a_Phone_Number17 a = new Letter_Combinations_of_a_Phone_Number17();
        List<String> b = a.letterCombinations("234");

        for(int i =0;i<b.size();i++){
            System.out.println(b.get(i));
        }

        StringBuilder e = new StringBuilder();
        e.append("abd");
        System.out.println(e.toString());
        e.setLength(e.length()-1);
        System.out.println(e.toString());
    }
}
