// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//find the element repeating more than twice and then move the whole array to that index, maintaing a last pointer
//The last pointer decreases everytime we move the array.
// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int last = nums.length-1;
        if(last==0)
            return last+1;
        int start=0;
        int i=start+1;
        while(i<last)
        {
            if(nums[start]==nums[i])
            {
                if(i+1<nums.length && nums[start]==nums[i+1])
                {
                    movearray(nums,i,last);
                    last--;
                }
                else
                {
                    start=i+1;
                    i=i+2;
                }
            }
            else
            {
               start=i++;
            }
        }        
        return last+1;
    }
    
    public void movearray(int[] nums, int start, int last)
    {
        for(int i=start+1;i<=last;i++)
            nums[i-1]=nums[i];
    }
}