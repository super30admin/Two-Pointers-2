// Time Complexity :    O(n) 
// Space Complexity :   O(1)    
// Did this code successfully run on Leetcode : Yes, The code ran successfully in leetcode
// Three line explanation of solution in plain english

// Take 2 pointer one being fast and one slow and compare fats and slow elements to size of array
// By comparing with k size elements
// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        int fast = 2;
        int slow = 2;
        int n = nums.length;
        int k = 2;

        // Initialize 2 variables slow and fast to itegrate over slow and fast pointer 
        while  ( fast < n ) {             // while fast <  size of array                  
            if ( nums[fast] != nums[slow -k] ) {               // Compare fast and slow array and compare skipping k
                nums[slow] = nums[fast];  
                slow++;                                  //   increment slow
            }
            fast++;                                         //  increment fast

        }
        return slow;        return slow
    }
}