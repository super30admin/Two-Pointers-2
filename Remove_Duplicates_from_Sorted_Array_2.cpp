/*
Time Complexity: O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int len = nums.size();
        int i = 0, p = 0;
        while(i<len){
            int e = nums[i];
            int c = 0;
            while(i<len && nums[i]==e){
                i++;
                c++;
            }
            nums[p]=e;
            p++;
            if(c>1){
                nums[p]=e;
                p++;
            }
        }
        return p;
    }
};