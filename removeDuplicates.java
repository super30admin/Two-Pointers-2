
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null)
            return 0;
        
        if(nums.length <= 2)
            return nums.length;
        
        int count = 1, j=1;
        
        for(int i=1;i< nums.length;i++){
            //if same, update count
            if(nums[i] == nums[i-1])
                count++;
            
            //count reset
            else {
                count =1;
            }
            
            //count <= 2
            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }

        }
        return j;
    }
}
