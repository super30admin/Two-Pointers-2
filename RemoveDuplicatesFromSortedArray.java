/* Time Complexity : O(n)
 * 	n - length of the input array - nums */
/* Space Complexity : O(1) */
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return -1;

        int n = nums.length;
        int count = 0;// count: to keep count of the frequency of each number
        int p = 0;//pointer

        for(int i = 0; i < n; i++){
            //If val at curr and prev index is not equal ==> we have found the next unique number
            //set count to '1', else increment count by 1
            if(i == 0 || nums[i] != nums[i-1]){
                count = 1;
            }else{
                count++;
            }

            //If count is less than 2 (as one duplicate is allowed), 
            //copy val at i to value at pointer and increment pointer
            if(count <= 2){
                nums[p] = nums[i];
                p++;
            }
            
            /*  Here 2 could be replaced with m,
             *  where m = no. of duplicates allowed + 1 */
        }
        return p;
    }
}