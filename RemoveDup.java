
public class RemoveDup {
    public int removeDup(int[] nums) {
        int count = 1;
        int i = 1;
        int j = 1;

        while (i < nums.length) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}