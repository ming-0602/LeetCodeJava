package arraysHassing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class twosum {
    public static void main(String[] args) {
        int[] nums = new int[]{3,4,5,6};
        int target = 7;

        System.out.println(Arrays.toString(twoSum(nums, target)));
//        System.out.println(Arrays.toString(twoSum2(nums, target)));
        twoSum2(nums, target);
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
       for(int i = 0; i < nums.length; i++){
           for(int j = i+1; j < nums.length; j++){
               if(nums[i] + nums[j] == target){
                   return new int[]{nums[i], nums[j]};
               }
           }
       }
       return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[][] darray = new int[nums.length][2];
        for(int i =0 ; i <nums.length; i++){
            darray[i][0] = nums[i];
            darray[i][1] = i;
        }

        for (int i = 0; i < darray.length; i++) {
            // Inner loop iterates through columns of the current row
            for (int j = 0; j < darray[i].length; j++) {
                System.out.print(darray[i][j]); // Print the element followed by a space
            }
            System.out.println(); // Move to the next line after printing all elements in a row
        }

        Arrays.sort(darray, (a,b) -> Integer.compare(a[0], b[0]));//increasing order or swap a[0] with b[0] for decressing order

        int i =0, j = nums.length-1;

        while (i < j) {
            if (darray[i][0] + darray[j][0] == target) {
//                return new int[]{darray[i][1], darray[j][1]};
                return new int[]{Math.min(darray[i][1], darray[j][1]), Math.max(darray[i][1], darray[j][1])};
            }
            else if(darray[i][0] + darray[j][0] > target){
                j--;
            }else{
                i++;
            }
        }

        return null;
    }
}
