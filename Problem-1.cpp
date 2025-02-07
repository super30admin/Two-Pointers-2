
// Time Complexity : O(n) where n is the length of the input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// calculate the frequency of current element, if it's less than or equal to 2 then keep it.
// If the count is beyond two remove them.

// Your code here along with comments explaining your approach

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n = nums.size();
        int slow = 1;
        int count =1;
        for(int i=1; i<n; i++){     
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{count = 1;}
            if(count <= 2){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
};