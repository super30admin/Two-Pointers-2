/*
 *                  Remove duplicates
 *
 * Leetcode : https://leetcode.com/problems/merge-sorted-array/description/
 * 
 * Time complexity : O(N)
 * Space complexity : O(1)
 * 
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : -
 * Your code here along with comments explaining your approach in three sentences only
 *          - Traverse the array with a slow pointer, allowing up to two occurrences of each element 
 *            by maintaining a count and overwriting excess duplicates in place.
 */
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int slow = 0;
        int count  = 1;

        for(int i = 1; i <nums.size(); i++) {
            if (nums[i] == nums[i-1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                slow++;
                nums[slow] = nums[i];
            }
        }
        return slow + 1;
        
    }
};

int main() {
    Solution solution;
    vector<int> nums = {1, 1, 1, 2, 2, 2, 2, 4, 3};
    
    int newLength = solution.removeDuplicates(nums);

    cout << "Array after removing duplicates: ";
    for (int i = 0; i < newLength; i++) {
        cout << nums[i] << " ";
    }
    cout << endl;

    return 0;
}