public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if (x<0) return false;

        else{
            int tmp =x;
            int palindrom_num= 0;
            while( tmp!=0){
                int a = tmp % 10;
                palindrom_num = palindrom_num *10 + a;
                tmp= tmp /10;
            }

            if(palindrom_num != x )
                return false;
            else
                return true;
        }
    }

    public static void main(String[] args) {
        Palindrome_Number a = new Palindrome_Number();
        Boolean b = a.isPalindrome(-11221);
        System.out.print(b);
    }
}
