package Nov4;


class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        
  /* 
	Time Complexity: O(n) where n is no.of elements in nums array.
	Because in worst case, there may be no repeating characters and we will need to iterate through all elements of nums array once in such a case.

	Space Complexity: O(1)
	No extra space used, so O(1).
	      
	Did this code successfully run on Leetcode : Yes

	Any problem you faced while coding this : No

	Approach:
    Two pointers approach used where one pointer(newIndex) is used to track the array position where we will place the new item in place. Another pointer(i) is used to iterate through all elements of the given array.
 
    */
        
        // edge
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
// Count variable is used to count the number of continuous repeating characters in the array. In this case, count is 2 as mentioned in the problem statement.
        int count = 1; 
        int newIndex = 1;
        
        // iterate through all elements of given array and replace the elements in given array in-place depending on how many repeating continuous characters are met(not more than 2 in this ques allowed).
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] && count < 2) {
                nums[newIndex] = nums[i];
                count++; 
                newIndex++;
            } else if (nums[i] == nums[i-1] && count >=2) {
                continue;
            } else if (nums[i] != nums[i-1]) {
                nums[newIndex] = nums[i];
                count = 1;
                newIndex++;
            }
        }
        
        return newIndex;
        
    }
}