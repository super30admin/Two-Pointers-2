// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// We can use two pointer approach here, along with a count variable
// The slow pointer will keep track of the position of the next element and i gives us value of the next element
// We only copy the value if it is duplicated at most twice, i.e, count<=2

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow =1;
        int count =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                count++;
            else
                count=1;
            if(count<=2)
                {
                    nums[slow] = nums[i];
                    slow++;
                }
        }
        return slow;
    }
}