// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We maintain two pointers and a counter, one to track the number, other to find the next unique element
// and counter to track the occurances of an element. We reset ocunter for every unique element.

// Your code here along with comments explaining your approach
#include <vector>
class Solution {
public:
    int removeDuplicates(std::vector<int>& nums) {
        int s = 0;
        int count = 1;

        for(int i = 1 ; i < nums.size(); i++)
        {
            // Increment counter for all the same elements
            if(nums[i] == nums[i-1])
            {
                count++;
            }
            // Reset counter for first occurance of next unique element
            else
            {
                count = 1;
            }
            // if two elements are encountered, then update slow pointer and add next unique element.
            if(count <= 2)
            {
                s++;
                nums[s] = nums[i];
            }
        }
        return s + 1;
    }
};