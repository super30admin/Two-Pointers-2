public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        //TC: O(N); SC: O(1)
        int n = nums.length;
        int slow = 0;
        int count = 1;
        for(int fast = 1; fast < n; fast++) {
            if(nums[fast] == nums[fast - 1]) {
                count++;
            } else count = 1;

            if(count <= 2) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }
}
