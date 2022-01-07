// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : 

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        
        // return 0 if array is null or empty
        if(nums == null || nums.length == 0) return 0;
        
        // intialize i and count pointer
        int i = 0;      // to track new insertion
        int count = 0;  // to count occurence
        
        // traverse through the array
        for(int j = 0; j < nums.length; j++){
            
            // increment count if two consecutive elements are same
            if(j > 0 && nums[j] == nums[j - 1]){
                count++;
            } 
            else{
                count = 1; //if new element occurs, set count to 1   
            }
            
            if(count <= 2){
                // replace the element and increment i pointer
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}