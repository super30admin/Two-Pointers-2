public class RemoveDuplicates {
    /**
     * Time Complexity - O(n) where n is the size of nums
     * Space Complexity - O(1)
     * Logic - have 2 pointers slow and fast, slow ptr will be the placeholder for the next unique element
     *         and fast ptr will be the index for the next unique element in the array
     *         loop through the array: if val at fast ptr == val at fast ptr -1 that means we have encountered a duplicate
     *         element, increment count, else reset count to 1 indicating we have encountered a new unique element.
     *         keep copying element from nums[fast] to nums[slow] as long as count <= k and increment slow ptr.
     *         After the looping is done return the index of slow ptr
     *
     * @param nums
     * @return slow index
     */
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;
        int k = 2;
        int count = 0;
        int n = nums.length;

        // input - [1,1,1,2,2,3]

        while (fast < n) {
            if (fast > 0 && nums[fast] == nums[fast - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= k) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
