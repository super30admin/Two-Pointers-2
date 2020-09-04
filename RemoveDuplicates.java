/* 80. Remove Duplicates from Sorted Array II - MEDIUM
https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

3 approaches
*/
public class RemoveDuplicates {

    // COUNTER approach - can be used for remove 'k' dupliates
    // use count variable to keep track of number of variables
    // re-initialize count to 1 to indicate prev element is different that current element
    // if we see a duplicate element, and the count < 2, then update the nums array, 
    // if count >= 2, we just move to the next element
    //
    // TC: O(n), visit all elemets once
    // SC: O(1), constant space
    public int removeDuplicates1(int[] nums) {
        int i = 1;        
        int count = 1;
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j-1]) {
                count = 1;
                nums[i] = nums[j];
                i++;
            } else {
                if (count < 2) {
                    nums[i] = nums[j];
                    i++;
                }
                count++;
            }
        }
        return i;
    }

    // FLAG APPROACH - Same as count, no need to maintain extra count, cannot be extended for 'k' duplicates
    // Flag when true, means that this element has to added to result, if it is a duplicate
    // Flag false denotes that 2 duplicates were already encountered
    // 
    // TC: O(n), visit all elemets once
    // SC: O(1), constant space
    public int removeDuplicates2(int[] nums) {
        int index = 1;
        boolean needsToBeAdded = true;
        
        int prev = 0;
        int curr = 1;
        
        while (curr < nums.length) {
            if (nums[prev] != nums[curr]) {
                prev = curr;
                nums[index++] = nums[curr++];
                // reset flag to indicate that this element may need to be added
                needsToBeAdded = true;
            } else {
                if (needsToBeAdded == true) {
                    nums[index++] = nums[curr++];
                    // 2 duplicates already seen
                    needsToBeAdded = false;
                } else {
                    curr++;
                }
            }
        }
        return index;
    }
    
    // Can be extended to remove 'k' duplicates
    // Idea is to compare each number to the number at position (i-2)
    // If it is greater, then we can be sure, that this is not the 3rd occurence of the element
    // and add it into the result
    //
    // O(n): visit all elements once
    // O(1): constant space
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num: nums) {
            if (i < 2 || num > nums[i-2]) {
                nums[i++] = num;
            }
        }
        return i;
    }
}
