public class Reverse_integer {
    public int reverse(int x) {
        long num = 0;


        while (x != 0) {
            int b  = x %10;
            num = num*10 + b;
            x = x / 10;
        }
        long check = num;
        if (check > Integer.MAX_VALUE || check < Integer.MIN_VALUE )
            return 0;
        return (int) num;
    }

    public static void main(String[] args) {
        Reverse_integer  a = new Reverse_integer();
        int result = a.reverse(1534236469);
        System.out.println(result);

    }
}
