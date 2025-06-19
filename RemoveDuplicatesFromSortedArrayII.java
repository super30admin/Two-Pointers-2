// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: Yes

class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 1;
        }

        int writeIdx = 1; // pointer to track the position in nums for next element to be written
        int elementIdx = 1; // pointer to track current element
        int elementCount = 1; // counter to track occurrences of the current element so far

        while (elementIdx < n) {
            if (nums[elementIdx] != nums[elementIdx - 1]){
                elementCount = 1;
                nums[writeIdx] = nums[elementIdx];
                writeIdx++;
            } else {
                elementCount++;
                // add the current element at most 2 times
                if(elementCount <= 2){
                    nums[writeIdx] = nums[elementIdx];
                    writeIdx++;
                }
            }
            elementIdx++;
        }
        return writeIdx;
    }
}

class RemoveDuplicatesFromSortedArrayIIRunner {
    public static void main(String[] args) {
        int[] nums = new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        RemoveDuplicatesFromSortedArrayII removeDuplicatesFromSortedArrayII = new RemoveDuplicatesFromSortedArrayII();

        System.out.println(removeDuplicatesFromSortedArrayII.removeDuplicates(nums));
    }
}