/*

Time complexity : O(N)
space complexity :O(1)
is worked on leetcode : YES
*/

public class RemoveDuplicates_FromArray {
    public int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int curr_count =1;
        int i=1;
        int j =1;
        
        while( i <nums.length && j < nums.length){
            if(nums[j] == nums[j-1]){
                if(curr_count >= 2){
               
                    j++;
                    
                }
                else{
                    curr_count++;
                    nums[i] = nums[j];
                    i++;
                    j++;
                }
            }else{
                curr_count =1;
                nums[i] = nums[j];
                j++;
                i++;
            }
        }
        return i;
        
    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int curr_count =1;
        int i=1;
        
        for(int j =1;j<nums.length;j++){
            if( nums[j-1] == nums[j]){
                if(curr_count >=2){
                    curr_count++;
                    continue;
                    
                }
                else{
                    curr_count++;
                    i++;
                }
            }else{
                curr_count = 1;
                nums[i] = nums[j];
                i++;
            }
        }
    
        return i;
        
    }
    
}