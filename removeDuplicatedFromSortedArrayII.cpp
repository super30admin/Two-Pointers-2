//time complexity:O(n)
//space complexity:O(1)
//executed on leetcode: yes
//approach:keep a count of the same elements
//any issues faced? yes, was not able to pass all cases in first go
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.size()==0)
            return 0;
        int index=1;
        int count=1;
        for(int i=1; i<nums.size(); i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count<=2)
            {
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
};