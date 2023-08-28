// Time Complexity : O (n) 
// Space Complexity : O (1) no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : minor issues

public class prob1 {

    public static int removeDupes(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int j = 1; int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }

            if(count < 3){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int [] nums = {2, 0, 1, 0, 2, 1, 0, 0, 2, 2, 1, 1, 1, 1};
        int j = removeDupes(nums);
        System.out.println(j);
        for(int i = 0; i < j; i++){
            System.out.println(nums[i]);
        }
        
    }
    
}
