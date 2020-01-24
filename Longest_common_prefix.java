public class Longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        if(length ==0) return "";

        String first_str = strs[0];

        for(int i =1; i<length; i++){
            while (strs[i].indexOf(first_str) != 0){   // if the first string is substring of the rest string
                first_str = first_str.substring(0,first_str.length()-1);

            }
        }
        return first_str;

    }

    public static void main(String[] args) {
        Longest_common_prefix a = new Longest_common_prefix();
        String[] strs = {"c", "acc", "cc"};
        String result = a.longestCommonPrefix(strs);
        System.out.print(result);
    }
}
