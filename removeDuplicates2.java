
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null)
            return 0;
        
        if(nums.length <= 2)
            return nums.length;
        
        //j is the slow pointer
        int count = 1, j = 1;
        
        //i is the fast pointer
        for(int i = 1; i < nums.length; i ++){
            //if they are the same then we update count
            if(nums[i] == nums[i - 1]){
                count++;
            }
            //not same then reset the count
            else{
                count = 1;
            }
            
            //because max of 2 duplicates are allowed
            if(count <= 2){
                
                if(i != j) nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}