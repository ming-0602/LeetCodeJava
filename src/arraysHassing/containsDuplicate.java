package arraysHassing;

import java.util.Arrays;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] tem = new int[]{1,2,3,4};
        int[] tem2 = new int[]{1,2,3,3};

        containsDuplicate c = new containsDuplicate();
        System.out.println(c.containsDuplicate(tem));
        System.out.println(c.containsDuplicate(tem2));

        System.out.println(c.containsDuplicate2(tem));
        System.out.println(c.containsDuplicate2(tem2));


    }

    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int tem = nums[i];
            for(int j=i+1; j < nums.length; j++){
                if(nums[j] == tem){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
