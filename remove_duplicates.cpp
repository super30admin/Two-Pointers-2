// Time Complexity : O(n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        int i = 0;
        int len = nums.size();
        int temp;
        int count;
        
        if(nums.size() <= 2)
            return nums.size();
         
        while(i < len)
        {
            temp = nums[i];
            count = 0;
            
            //Find number of iterations
            while(i < len && nums[i] == temp)
            {
                i++;
                count++;
            }
            
            if(i > 0)
                i--;
            
            // Remove excess elements
            if(count > 2)
            {    
                for(int j = 0; j < count-2; j++)
                {
                    nums.erase(nums.begin() + i);
                    i--;
                    len--;
                }
            }
            else
                i++;
        }
        
        return nums.size();
    }
};