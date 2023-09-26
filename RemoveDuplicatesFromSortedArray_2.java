
public class RemoveDuplicatesFromSortedArray_2 {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int slow = 1;
        int fast = 1;

        while (fast < nums.length) {
            if (nums[fast] == nums[fast - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[slow] = nums[fast];
                slow++;
            } else {

            }
            fast++;
        }
        return slow;
    }
}
