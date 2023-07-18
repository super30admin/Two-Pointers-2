
// Time Complexity : O(n)
// Space Complexity : O(1) in place method
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

//Solution with slow and fast pointer.
//For same elements, keep incrementing the count. When unique element is found, reset the count to 1.
//Copy elements from fast pointer to slow pointer position and increment slow pointer till count <= desired count (2)
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int low = 1, currCount =1;

        for(int i =1; i<n; i++) {
            if(nums[i] == nums[i-1]){
                currCount++;
            }else{
               currCount = 1; 
            }
            
            if(currCount<=2){
                nums[low] = nums[i];
                low++;
            } 
        }
        return low;
    }
}