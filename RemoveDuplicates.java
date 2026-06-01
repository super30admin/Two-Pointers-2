//Time Complexity : O(n)
//Space Complexity : O(1)

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;
        int count = 0;
        int n = nums.length;
        while (fast < n) {
            if (fast != 0 && nums[fast] == nums[fast - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[slow] = nums[fast];
                slow++;
            }

            fast++;
        }

        return slow;
    }
}
