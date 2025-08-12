// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach:
// 1) Scan with fast; maintain count of the current value’s consecutive occurrences.
// 2) When count <= 2, write nums[fast] to nums[slow] and advance slow (allow at most two).
// 3) Reset count to 1 whenever the value changes; return slow as the new length.


public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int slow = 0, fast = 0;
        int count = 0;
        int k = 2;

        while(fast < nums.length){
            if(fast != 0 && nums[fast] == nums[fast - 1]){
                count++;
            }else{
                count = 1;
            }

            if(count <= k){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
