/**
 * TC - O(n)
 * SC - O(1)
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) {
            return 1;
        }

        int i = 0, j = 1, k = 0, count = 1;

        while(j < nums.length) {
            // adj numbers are same
            if (nums[j - 1] == nums[j]) {
                if (count == 1) {
                    count++;
                    i++;
                    nums[i] = nums[j];
                }
            } else { // adj numbers are different
                count = 1;
                i++;
                nums[i] = nums[j];
            }
            j++;
        }

        return i+1;
    }
}
