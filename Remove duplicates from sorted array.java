
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//We will set two pointers slow and fast. Slow pointer is store the non duplicate values found. To find the non duplicate values, 
//we will be using the fast pointer. We will set the slow and fast pointer both at index 0 and then use a for loop to iterate through the given array. When the occurence of any number is more that 2, we skip to the number which is different from the previous one, 
//otherwise we record the occurences in the slow pointer index.

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int slow=1, count=1;

        for(int i=1;i<nums.length;i++)
        {
            //if the number is same as the previous one, we increment the count
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            //otherwise if the number is new, we reset the counter to 1 
            else
            {
                count=1;
            }
            //if the occurence is less than equal to 2, then we store it, where the slow pointer is and increment the slow pointer
            if(count<=2)
            {
                nums[slow]=nums[i];
                slow++;
            }
        }
        return slow;
    }
}