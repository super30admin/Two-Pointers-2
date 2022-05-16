// Time Complexity :  O(n) where n = input size. 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english

/* Use two pointers i, j and count variable to maintain the occurrence count of current element. 
 * Iterate over array using pointer i, if (i)th element and (i-1)th element are same then increment the count.
 * If count is less than three then replace the (j)th element of i/p array with (i)th element and increment j.
 * At the end return j.
 */

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if (nums.size() == 0)
            return 0;
        
        int j = 1, count = 1;
        
        for (int i = 1; i < nums.size(); i++)
        {
            if (nums[i] == nums[i - 1])
            {
                count++;
            }
            else
            {
                count = 1;
            }
            
            if (count < 3)
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
};