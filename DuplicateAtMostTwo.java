// Time Complexity : O(n) where n is the number of elements in the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I was maintaining count but not able to assign it 
/* Your code here along with comments explaining your approach: Take a slow and a fast pointer. When the number at slow pointer is equal to the number
pointed by fast pointer, it means we have found duplicate exists and turn the flag to 1. We move the slow pointer to check anymore duplicates exist
or not. If yes, then we move the fast pointer till the position where duplicates finish for the particular element slow is pointing to. As fast gets
  unequal to slow, fast replaces the slow element because we want to eliniminate duplicates more than 2. And we turn the flag back to 0. We do this repetitively till
fast traverses the whole array.
*/
class Solution {
    public int removeDuplicates(int[] nums) {
     int slow = 0, fast = slow+1, flag = 0; // Duplicate yet to happen
     while(fast < nums.length){
         if(nums[slow] == nums[fast]){
             if(flag == 0){             // If duplicate occurs
             flag =1;
             slow++;
             nums[slow] = nums[fast];       // Move the slow to the enxt position as we have got our two duplicates 
             fast++;
             } else {
                 while(fast<nums.length && nums[slow]==nums[fast]){         // While duplicates exists, move the fast pointer, Slow doesnt care
                 fast++;}
             }
         } else {
             flag = 0;                                  // If the slow and fast are not equal, move slow to the next position and replace with fast
             slow++;
             nums[slow] = nums[fast];
             fast++;
         }
     }
        return slow+1;                      // return the length as slow + 1(index)
        }
}