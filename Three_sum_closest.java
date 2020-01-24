import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.math.*;

public class Three_sum_closest {
    public int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        int  result=0;
        int  min_distance = 99999;
        Arrays.sort(nums);

        for(int i =0 ; i<length-2;i++){
            int j = i+1;
            int k = length-1;

            while(j<k){

                int a = nums[i];
                int b = nums[j];
                int c = nums[k];

                int sum = a + b + c;
                System.out.println(sum);
                if (sum ==target) {
                    return sum;
                }else if(sum < target){
                    j = j+1;
                    int distance = sum - target;
                    distance = Math.abs(distance);
                    if(distance < min_distance){
                        result = sum;
                        min_distance = distance;
                    }

//                    System.out.print(result);

                } else {
                    k = k-1;
                    int distance = sum - target;
                    distance = Math.abs(distance);
                    if(distance < min_distance){
                        result = sum;
                        min_distance = distance;
                    }

                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Three_sum_closest a = new Three_sum_closest();
        int b[] = {1,1,1,0};
        int d[] = {1,1,-1,-1,3};
        int e[] = {1,2,4,8,16,32,64,128};
        int c = a.threeSumClosest(e, 82);
        System.out.print(c);
    }
}
