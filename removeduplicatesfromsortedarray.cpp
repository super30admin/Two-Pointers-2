//Time complexity : O(n)
//Space complexity : O(1)
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.size() == 0)
            return 0;
        
        int j = 1;
        int count = 1;
        
        for(int i = 1; i < nums.size(); i++)
        {
            if(nums[i] == nums[i - 1])
            {
                count++;
            }
            else
            {
                count = 1;
            }
            
            if(count < 3)
            {
                nums[j] = nums[i];
                j++;
            }
        }
        
        return j;
    }
};