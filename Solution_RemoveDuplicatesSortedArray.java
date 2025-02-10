//TC: O(n)
//SC: O(1)
//Did it run on leetcode: Yes
public class Solution_RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        int n = nums.length-1;
        int slow = 1;
        int fast = 1;
        int count = 1;
        while(fast <= n){
            if(nums[fast] == nums[fast-1]){
                count++;
            } else {
                count = 1;
            }

            if(count <= 2){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
