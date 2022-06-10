// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
 * We are first traversing the array, we check if the next element is same as the previous element 
 * and we increment the counter. If it is not, counter will be initialized to 1 again. 
 * Now, if the count is less than or equal to k, we are simply initializing element at slow to element at i.
 * (Replace extra duplicate elements)
 */

// Your code here along with comments explaining your approach

public class Duplicate {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};  
        System.out.println(removeDuplicates(nums));      
    }

    public static int removeDuplicates(int[] nums) {
        
        if(nums == null || nums.length == 0)
        {
            return 0;
        }
        
        int count = 1,slow = 1;
        
        for(int i = 1; i<nums.length; i++)
        {
            if(nums[i] == nums[i - 1])
            {
                count++;
            }
            
            else
            {
                count = 1;
            }
            
            if(count <= 2)
            {
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;                
    }
    
}
