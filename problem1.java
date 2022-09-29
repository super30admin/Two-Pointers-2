public class problem1 {
    public int removeDuplicates(int[] nums) {
// Time Complexity : O(n) -> n is number of elements in array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : 
        if(nums == null || nums.length == 0) return 0;
        
        int n = nums.length;
        int count = 1;
        int j = 1;
        
        for(int i = 1; i<n; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count <= 2){
               nums[j] = nums[i];
                j++;
            }
        }
        
        return j;
    }
}
