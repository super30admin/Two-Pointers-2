// ## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)


// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english 

// Your code here along with comments explaining your approach
// we used two pointers here, one slow and one fast. Fst pointer traversed the array, slow pointer maintained the position of last position of the array required in the answer. Count variable used to make sure that only 2 entries are put in output.





class Solution {
    public int removeDuplicates(int[] nums) {

        
        int j=1;
        int count =1;
        int n =nums.length;

        for(int i=1; i<n;i++)
        {
            if(nums[i]==nums[i-1])
                count++;
            else
                count =1;
            if(count<=2)
            {
                nums[j]=nums[i];
                
                j++;
            }
        }
        return j;
        
    }
}