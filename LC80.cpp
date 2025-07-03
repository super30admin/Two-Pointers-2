// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int k = 2;
        int n = nums.size();

        int slow = 1;
        int count = 1;
        for (int fast = 1; fast < n; fast++) {
            if (nums[fast] == nums[fast-1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= k) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
};