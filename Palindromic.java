
public class Palindromic {

    public String longestPalindrome(String s) {
        if(s.length() == 0) return "";
        else if (s.length()  ==1) return s;

        int start = 0,end = 0;

        for(int i =0; i<s.length();i++){
            int len1 = ExpandAroundCenter(s,i,i);
            int len2 = ExpandAroundCenter(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len > end-start +1){
                start = i - (len-1)/2 ;
                end = i+ len/2;
            }
        }
        return s.substring(start,end+1);
    }

    public int ExpandAroundCenter(String s, int left, int right){
        int L = left;
        int R = right;
        while( L >= 0 &&  R <s.length() && s.charAt(L) == s.charAt(R)){
            L--;
            R++;
        }
        return R-L -1; //return the length of the Palindrmic

    }


    public static void main(String[] args) {
        Palindromic s = new Palindromic();
        String str  = s.longestPalindrome("abac");
        System.out.println(str);
    }
}




