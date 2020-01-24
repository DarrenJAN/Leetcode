import java.util.HashMap;
import java.util.Hashtable;

public class Twosum {
    public int[] twosum(int[] nums, int target){
        for(int  i =0;i<nums.length;i++){
            for(int j= 0 ;j<nums.length;j++){
                if( i != j ){
                    if (nums[i] + nums[j] == target){
                        return new int[]{i ,j };
                    }
                }
            }
        }
        return new int[] {0};
    }


    public int[] twosum_n(int[] nums, int target){
        int len = nums.length;
        HashMap<Integer, Integer> table = new HashMap<>();

        for (int i= 0;i<len;i++){
            table.put(nums[i], i);
        }

        for (int i = 0;i<len;i++){
            int rest = target - nums[i];
            if(table.containsKey(rest) && table.get(rest) != i){
                return new int[] {i, table.get(rest)};
            }

        }
        throw new IllegalArgumentException("No two sum solutions! ");
    }

    public int[] twosum_3(int[] nums, int target){
        int len = nums.length;
        HashMap<Integer, Integer> table = new HashMap<>();

        for (int i = 0;i<len;i++){
            table.put(nums[i],i);
            int rest = target - nums[i];
            if(table.containsKey(rest) && table.get(rest) != i){
                return new int[] {i, table.get(rest)};
            }
        }
        throw new IllegalArgumentException("No two sum solutions! ");
    }


    public static void main(String[] args) {
        int[] num = {3,3};

        Twosum a = new Twosum();
        int[] re = a.twosum_3(num, 6);
        System.out.print(re[0]);
        System.out.print(re[1]);
    }
}
