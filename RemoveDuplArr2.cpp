// Time Complexity : o(n log n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n = nums.size();
        int maxx = pow(10, 4)+1;
        int count = 1;
        int prev = nums[0];
        int popCount=0;
        for(int i=1;i<n;i++) {
            if(prev == nums[i]) {
                count++;
            } else {
                count = 1;
            }
            prev = nums[i];
            if(count >= 3) {
                nums[i] = INT_MAX;
                popCount++;
            }
        }
        sort(nums.begin(),nums.end());
        int ans = 0;
        for(int i=0;i<popCount;i++) {
            nums.pop_back();
        }
        cout << ans << endl;
        return n-popCount;
    }
};