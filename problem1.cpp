// Time Complexity : O(n) --> Iterate through the entire array once
// Space Complexity : O(1)  --> Only int variables declared [space = O(1)]
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/* 
-> While iterating through the array use two pointers keep a track of all the cases when 3 consecutive elements are the same
-> In such a case, ignore the third value and move the pointer above
-> Otherwise, update the array
*/

// Your code here along with comments explaining your approach

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution{
    public:
        int removeDuplicates(vector<int>& nums)
        {
            if(nums.size() == 0) return 0; 

            if(nums.size() <= 2) return nums.size();

            int previous = 1;
            int current = 2;

            while(current < nums.size())
            {
                if(nums[current] == nums[previous] && nums[current] == nums[previous-1]) //three consecutive same terms
                    current++; //ignore the previous [which is the third value in this case]
                else
                {
                    previous++;
                    nums[previous] = nums[current]; //update the previous to skip third value from the array
                    current++;
                } 
            }

            return previous+1;
        }
};