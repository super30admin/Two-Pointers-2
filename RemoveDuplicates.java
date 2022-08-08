// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
We maintain two pointers, one pointer helps us count number of redundacies for a number and 2nd pointer (slow) only movees for allowed number of redundancies of each number
*/



public class RemoveDuplicates{
    public static int removeDuplicates(int[] nums) {
        int count=1;
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                count++;
            else count=1;
            
            if(count<=2)
            {
                nums[index++]=nums[i];
                
            }
        }
        
        return index;
    }

    public static void main(String[] args)
    {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));

    }
}