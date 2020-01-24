public class Container_with_most_water {
    static public int min(int a, int b){
        if( a<= b) return a;
        else return b;
     }

    public int maxArea(int[] height) {

        int length = height.length;
        if(length <=1)
            return 0;

        int current_max = Integer.MIN_VALUE;
        for(int i = 0;i<length;i++){
            for(int j = i;j<length;j++){
                if( i != j){
                    int width = j -i;
                    int h = min(height[i],height[j]);
                    int area = width * h;
                    if (area > current_max)
                        current_max = area;
                }
            }

        }
        return current_max;
    }


    public int maxArea_2(int[] height){
        int length = height.length;
        if(length <=1)
            return 0;

        int l = 0, r = length-1;
        int max_area = 0;
        while( l < r){
            int cur_area =  min(height[l], height[r]) * (r -l);
            if(cur_area > max_area)
                max_area= cur_area;

            if( height[l] < height[r])
                l++;
            else
                r--;
        }

        return max_area;
    }


    public static void main(String[] args) {
        Container_with_most_water a = new Container_with_most_water();
        int[] b = {1,8,6,2,5,4,8,3,7};
        int[] c = { 1,1,9,1};
        int re  = a.maxArea_2( b);
        System.out.print(re);
    }
}
