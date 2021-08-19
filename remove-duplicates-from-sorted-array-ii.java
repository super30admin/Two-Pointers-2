//Time Complexity: O(n), where n is the number of elements in the given array
//Space complexity: O(1)
//running on leetcode: yes
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums==null || nums.length==0)
        {
            return 0;
        }
        int count=1, i=1, j=1;
        //i keeps track of current index and j keeps track of index of the last double element 
        while (i<nums.length)
        {
            if (nums[i]==nums[i-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if (count<=2)//here 2 can be replaced by any value (number of duplicates allowed)
            {
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}
