// Time Complexity: O(n)
// Space Complexity: O(1)

// Two pointer approach, 1 for tracking index of each element. 2 for tracking what index can be filled onto 1

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int p1 = 1, p2 = 1;
        int freq = 1;
        while (p2 < nums.length) {

            if (nums[p2] == nums[p2-1]) freq++;
            else freq = 1;

            if (freq <= 2) {
                nums[p1] = nums[p2];
                p1++;
                p2++;
            } else {
                p2++;
            }
        }
        return p1;
    }
}
