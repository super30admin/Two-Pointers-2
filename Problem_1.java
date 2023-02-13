// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* We use 2 pointers slo and fast here. The fast pointer counts the repeating elements and slo points to the position where
   we have to insert. We keep on increasing count when nums[fast] == nums[fast - 1]. Till count <= 2, we copy nums[slo] = nums[fast] 
   and increment slo++. Else we just increment fast. In the end when fast > nums.length, slo is pointing to element after we have
   removed the duplicates and we return it.
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;

        int slo = 1, fast = 1, count = 1;

        while(fast < nums.length) {
            if(nums[fast] == nums[fast - 1]) 
                count++;
            else 
                count = 1;

            if(count <= 2) {
                nums[slo] = nums[fast];
                slo++;
            }
            fast++;
        }
        return slo;
    }
}