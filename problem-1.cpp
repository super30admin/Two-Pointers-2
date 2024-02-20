// 80. Remove Duplicates from Sorted Array II
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
    
uses two pointers, k and p, where k keeps track of the total valid elements in
the array and p points to the next position to be filled. iterating
through the array, incrementing count when encountering consecutive duplicates 
less than two, and shifting elements accordingly to maintain the constraint. Finally, 
returns the count of valid elements, which effectively represents the length of 
the modified array.

*/

int removeDuplicates(vector<int>& nums) {
        int  count = 1, k = 0, p = 1;
        for(int i = 1; i < nums.size(); i++)
        {
            if(nums[i-1] != nums[i])
            {
                k+=count;
                count = 1;
                nums[p] = nums[i];
                p++;
                
            }
            else if(nums[i-1] == nums[i] && count < 2)
            {
                count++;
                nums[p]=nums[i];
                p++;
            }
            else
                continue;
        }
        return k+count;
    }