public class Problem1 {
    //Time Complexity O(n)
// Space Complexity O(1)

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int slow = 1;
        int fast = 1;
        int counter = 1;
        while (fast <= nums.length - 1) {
            if (nums[fast] == nums[fast - 1]) {
                if (counter < 2) {
                    nums[slow] = nums[fast];
                    slow++;
                }
                counter++;
            } else {
                counter = 1;
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        int[] nums1 = {1, 1, 1, 2, 2, 2, 3, 3};
        int result = problem1.removeDuplicates(nums1);
        System.out.println("Final value " + result);
    }
}
