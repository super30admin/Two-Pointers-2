// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Maintain a slow pointer, which will act as a "catching pointer", to catch atmost 2 of each unique element
// Maintain an i pointer to traverse the array and maintain the count of the element
// If we have 2 of an element, don't increment slow and increment i till we get a unique element
// The answer will be stored in the slow pointer

// Your code here along with comments explaining your approach
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i = 1; int slow = 1; int count = 1;
        int n = nums.size();
        while(i < n) {
            if(nums[i] == nums[i-1]) {
                count++;
            } else {
                count = 1;
            }
            if(count <= 2) { 
                nums[slow] = nums[i];
                slow++;
            }
            i++;
        }
        return slow;
    }
};