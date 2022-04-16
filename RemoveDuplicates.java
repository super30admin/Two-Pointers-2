public class RemoveDuplicates {

    // Time complexity: O(n)
    // Space complexity: O(1)
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int count = 1;
        int slow = 1;

        for(int fast = 1; fast < nums.length; fast++) {
            // If the current element is equal to the previous element, increase the counter
            // Else, reset the counter because it's the first occurrence
            if(nums[fast] == nums[fast - 1]) {
                count++;
            }else {
                count = 1;
            }

            // This will swap the current element with the current position of the slow pointer
            // By swapping it we are making sure that it's considered in the final array
            if(count <= 2) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }

}
