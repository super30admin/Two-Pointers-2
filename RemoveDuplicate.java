// Time Complexity : O(n) where n are length of input arrays
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

public class RemoveDuplicate {
    public static void main(String[] args) {
        
    }

    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int i = 1, j = 1, count = 1;
        
        while(j < nums.length){
            if(nums[j] == nums[j-1]){
                count++;
            }else{
                count = 1;
            }
            
            if(count <= 2){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}
