/* Time Complexity :  O(n)
   Space Complexity :   O(1)
   Did this code successfully run on Leetcode : Yes
   Any problem you faced while coding this : No
   Method:Use two pointer approach
*/
class Solution {
    public int removeDuplicates(int[] nums) {
      int i=1,j=1,count=1;
        while(i<nums.length){
            if(nums[i]==nums[i-1])
                count++;
            else
                count=1;
            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}