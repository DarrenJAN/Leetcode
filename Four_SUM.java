import java.util.*;

public class Four_SUM {
    //better to use helper function
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        int length = nums.length;
        if(length == 0) return res;

        for(int i =0;i<length-3;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

            for(int j=i+1;j<length-2;j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int l = j+1;
                int r = length-1;
                int z= 0;
                while(l<r){

                    int a = nums[i];
                    int b = nums[j];
                    int c = nums[l];
                    int d = nums[r];
                    int sum = a + b + c + d;
                    if(sum== target){
                        List<Integer> temp  = new ArrayList<>();
                        temp.add(a);
                        temp.add(b);
                        temp.add(c);
                        temp.add(d);

                        res.add(temp);

//                        System.out.println(l);
//                        System.out.println(r);
                        while(nums[l] == nums[l+1] && l < r-1) {
                            l++;

                        }

                        while(nums[r] == nums[r-1] && l<r) r--;
                        l++;
                        r--;

                    }
                    else if(sum < target)
                        l++;
                    else
                        r--;
                }

            }
        }
        return res;

    }

    public static void main(String[] args) {
        Four_SUM a = new Four_SUM();
        int[] b = {1, 0, -1, 0, -2, 2};
        int[] c = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        List<List<Integer>> res = a.fourSum(c, 0);

        System.out.println();
        System.out.println(res.size());
        for(int i =0;i<res.size();i++){
            for(int j=0;j<4;j++) {
                System.out.print(res.get(i).get(j));
            }
            System.out.println();
        }
    }
}
