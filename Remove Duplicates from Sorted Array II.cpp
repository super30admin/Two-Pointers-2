// time: O(n)
// space: O(1)
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int count = 1;
        int s = 0, f = 1;
        while(f < nums.size()) {
            if(nums[s] == nums[f]) {
                count++;
                s++;
                nums[s] = nums[f];
                f++;
                if(count > 2) {
                    while(f < nums.size() && nums[s] == nums[f]) {
                        f++;
                    }
                    if(f == nums.size()) {
                        return s;
                    }
                    nums[s] = nums[f];
                    f++;
                    count = 1;
                }
            }
            else {
                s++;
                nums[s] = nums[f];
                f++;
                count = 1;
            }
        }
        return s+1;
    }
};