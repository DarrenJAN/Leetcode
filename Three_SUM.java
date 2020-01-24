import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Three_SUM {
    //slow version O(n^3)
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean zero = false;

        int length = nums.length;
        for(int i = 0;i<length;i++){
            for(int j=i+1;j<length;j++){
                for(int z=j+1;z<length;z++){
                    int flag = 0;
                    if(z != j && z != i && i !=j){
                     int a = nums[i];
                     int b = nums[j];
                     int c = nums[z];
                     if(a + b + c == 0){
                         List<Integer> temp = new ArrayList<>();

                         temp.add(a);
                         temp.add(b);
                         temp.add(c);
                         if(a ==0 && b==0 && c==0){
                             if(!zero){
                                 res.add(temp);
                                 zero= true;
                             }

                         }
                         if(res.size() == 0)
                             res.add(temp);


                         for(int k = 0;k<res.size();k++){
                           List<Integer> tmp = res.get(k);

                           if( (tmp.contains(a) &&  tmp.contains(b) && tmp.contains(c)))
                               flag = 1;
                         }
                         if (flag == 0)
                             res.add(temp);

                     }
                 }
                }
            }
        }
        return res;
    }

    public List<List<Integer>> improved_threeSum(int[] nums) {
        int length = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i =0 ; i<length-2;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = length-1;

            while(j<k){

                int a = nums[i];
                int b = nums[j];
                int c = nums[k];

                int sum = a + b + c;
                if (sum ==0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(a);
                    temp.add(b);
                    temp.add(c);

                    res.add(temp);
                    while (j<k && nums[j] == nums[j+1]) j++;
                    while (j<k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                }else if(sum < 0){
                    j = j+1;
                } else {
                    k = k-1;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Three_SUM a = new Three_SUM();
        int b[] = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        int c[] = {0,0,0};
        int d[] = {-2,0,1,1,2};
        List<List<Integer>> res = a.improved_threeSum(c);

        System.out.println();
        System.out.println(res.size());
        for(int i =0;i<res.size();i++){
            for(int j=0;j<3;j++) {
                System.out.print(res.get(i).get(j));
            }
            System.out.println();
        }

    }
}
