public class String_to_integer {

    public int myAtoi(String str) {
        boolean is_minus = false;
        boolean is_sign = false;
        boolean is_dight  = false;
        long result = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i);
            if (num == 32)
                if(is_dight) break;
                else continue;
            else if(num == 45){
                if(is_dight) break;
                else if(is_sign) break;
                else {
                    is_minus = true;
                    is_dight = true;
                    is_sign =true;
                }
            }
            else if(num == 43){
                if (is_dight) break;
                else if(is_sign ) break;
                else {
                    is_sign = true;
                    is_dight = true;
                }
            }
            else if ((num < 48 || num > 57) )
                break;
            else {
                is_dight= true;
                num -= 48;

                if(is_minus)
                    result = -Math.abs(result) *10 - num;
                else
                    result = result * 10  + num;


                if (result > Integer.MAX_VALUE ) {
                    return Integer.MAX_VALUE;
                }  else if(result <Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }


            }
        }

        return (int)result;
    }




    public static void main(String[] args) {
        String_to_integer a = new String_to_integer();
        int re = a.myAtoi("+   2++1 ");
        System.out.println(re);
    }
}
