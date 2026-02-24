//This is Remove Duplicates from Sorted Array II (each element allowed at most 2 times).
//
//Key idea:
//Use two pointers
//fast → scans array
//slow → places valid elements
//Compare with nums[slow - k] to ensure max k = 2 duplicates
//
//Time: O(n)
//Space: O(1)

class Solution {

    public int removeDuplicates(int[] nums) {

        // Maximum allowed duplicates
        int k = 2;

        // slow pointer → position to insert valid element
        // fast pointer → scans array
        int slow = k;
        int fast = k;

        // Traverse array
        while(fast < nums.length) {
            // Compare current element with element k positions before slow
            // If different → allowed to place
            if(nums[slow - k] != nums[fast]) {

                // Place element at slow position
                nums[slow] = nums[fast];

                // Move slow pointer forward
                slow++;
            }
            // Always move fast pointer
            fast++;
        }
        // slow pointer represents new length
        return slow;
    }
}