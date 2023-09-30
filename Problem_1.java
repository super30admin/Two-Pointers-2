/*

Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

*/

class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums == null || nums.length == 0){
            return 0;
        }

        int n = nums.length;
        int count = 1;
        int j = 1;
        for(int i =1; i<n; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
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