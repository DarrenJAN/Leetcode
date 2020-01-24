public class RomantoInteger {
    public int romanToInt(String s) {
        int length = s.length();
        int result = 0;
        if(length == 0){
            return result;
        }

        for(int i= 0;i<length;i++){
            Character c = s.charAt(i);
            if(c== 'M'){
                result += 1000;
            } else if( c == 'D') {
                result += 500;
            } else if( c == 'C') {
                if (i != length -1) {
                    if( s.charAt(i+1) == 'D') {
                        result += 400;
                        i = i+1;
                    }else if(s.charAt(i+1) == 'M'){
                        result += 900;
                        i = i+1;
                    } else result +=100;
                }else
                    result +=100;
            } else if(c == 'L'){
                result += 50;
            } else if(c== 'X'){
                if (i != length -1) {
                    if (s.charAt(i + 1) == 'L') {
                        result += 40;
                        i = i + 1;
                    } else if (s.charAt(i + 1) == 'C') {
                        result += 90;
                        i = i + 1;
                    }else result += 10;
                }else
                    result +=10;
            } else if( c == 'V'){
                result += 5;
            } else if(c == 'I'){
                if (i != length -1) {
                    if( s.charAt(i+1) == 'V') {
                        result += 4;
                        i = i+1;
                    }else if(s.charAt(i+1)== 'X'){
                        result += 9;
                        i = i+1;
                    } else
                        result +=1;
                }else
                    result +=1;
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        RomantoInteger a = new RomantoInteger();
        int b = a.romanToInt("MCMXCIV");
        System.out.println(b);
    }
}
