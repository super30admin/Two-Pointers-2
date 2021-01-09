// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Notes : Take two pointers i.e. slow and fast pointer, slow pointer will keep track of the number that might be duplicate, and fast pointer will keep incrementing until new number is not encountered. Slow pointer will keep track of index where the number is duplicated ONCE.

public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        if(nums.length > 2){
            int slow = 0;
        
            int count = 1;
            int fast = 1;
            while( fast < nums.length){
                if(nums[fast] == nums[slow]){
                    count = count + 1;
                } else {
                    count = 1;       
                }

                nums[slow + 1] = nums[fast];

                if(count <= 2){
                    slow = slow + 1;
                }

                fast = fast + 1;

            }

            return slow+1;
        }
        
        return nums.length ;
    }
}
