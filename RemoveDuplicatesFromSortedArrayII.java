class RemoveDuplicatesFromSortedArrayII {

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

    /*

    This approach removes duplicates from a sorted array while allowing at most two occurrences
    of each element. It uses two pointers: fast iterates through the array,
    while slow keeps track of the position where the next valid element should be placed.
    A count variable helps track the frequency of each element,
    resetting when a new number is encountered. If an element appears at most twice,
    it is copied to nums[slow], ensuring duplicates beyond two are skipped.
     This results in an O(n) time complexity with O(1) space,
     making it an efficient in-place solution

    */

    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        int slow = 1;
        int count = 1;

        for (int fast = 1; fast < n; fast++) {
            if (nums[fast] == nums[fast - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }
}