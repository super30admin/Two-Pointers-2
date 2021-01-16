// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//We start two pointers at index 2 and don't care about index 0 and 1 if they are same or different numbers.
//We'll have a fast and slow pointer, fast pointer will loop through the length of the array and we'll compare
// nums[slow-2] to nums[fast] and if not equal then nums[slow++] = nums[fast], once loop is complete return slow int value.

// Your code here along with comments explaining your approach


public class RemoveDuplicateFromSortedArraysTwo {

    class Solution {
        public int removeDuplicates(int[] nums) {
            //validation check
            if(nums == null || nums.length == 0) return 0;
            if(nums.length < 3) return nums.length;

            //intialize slow pointer
            int slow =2;

            //intialize fast pointer and loop through array
            for (int fast = 2; fast < nums.length; fast++) {
                //nums at fast isn't eaual to nums at slow -2 then then set nums at slow to value of nums at fast and
                //increment slow counter
                if(nums[slow-2] != nums[fast]){
                    nums[slow++] = nums[fast];
                }
            }
            return slow;
        }
    }
}
