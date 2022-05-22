/**
 * Two pointers
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * 
 * time: O(n)
 * space: O(1)
 * 
 * Approach:
 * Slow pointer: Store the elements till max allowed duplicates => k
 * 
 * Fast pointer: Iterates over all the elements 
 * and checks with previous element for duplicacy
 * 
 * 
 */
class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        // slow can start from 1 
        // as we can consider element at 0 to be unique
        int slow = 1;
        int fast = 1;
        
        int count = 1;
        int k = 2;
        
        while(fast < nums.length){
            
            if(nums[fast] == nums[fast-1]){
                count++;
            } else {
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
