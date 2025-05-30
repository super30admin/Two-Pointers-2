public class RemoveDuplicates {
    /**
     * Using two pointers (read and write), read and count same consecutive elements, if it is <= 2 (k=2),
     * we place that value at write element and move both pointers forward, ignore 3 or more repeats until
     * a new value is found and repeat the same until read pointer go through entire array
     *
     * Time: O(n) Space: O(1)
     */
    public int removeDuplicates(int[] nums) {
        int k = 2;
        int write = 1;
        int read = 1;
        int count = 1;

        while (read < nums.length) {
            if (nums[read] == nums[read - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= k) {
                nums[write] = nums[read];
                write++;
            }
            read++;
        }
        return write;
    }
}
