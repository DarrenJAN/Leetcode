import java.util.*;



public class Valid_parentheses {
    public boolean isValid(String s) {
        int length = s.length();
        if(length == 0) return true;
        if(length % 2 != 0) return false;



        Stack<String> stack = new Stack<>();
        for(int i =0;i<length;i++){
            if(s.charAt(i) == '[') stack.push("[");
            else if(s.charAt(i) == '{') stack.push("{");
            else if (s.charAt(i) == '(') stack.push("(");
            else if (s.charAt(i) == ']'){
                if(stack.isEmpty()) return false;
                else if( stack.pop()== "[") continue;
                else
                    return false;
            }else if (s.charAt(i)== '}'){
                if(stack.isEmpty()) return false;
                else if( stack.pop()== "{") continue;
                else
                    return false;
            }else if (s.charAt(i) == ')'){
                if(stack.isEmpty()) return false;
                else if( stack.pop()==  "(") continue;
                else
                    return false;
            }

        }

        if(stack.isEmpty()) return true;
        else return false;
    }


    public static void main(String[] args) {
        Valid_parentheses vp = new Valid_parentheses();

        String a = "(())";
        String b = "(){}[]";
        String c = "(((){}[]))";
        String d = "((())";
        String e = "{}[][)";
        String f = "}[";
        String g = "[{}{)())";
        String h = "()";
        String z ="[]";

        boolean res = vp.isValid(b);
        System.out.println(res);
    }
}
