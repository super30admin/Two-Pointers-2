/*
This approach uses two pointers to solve the problem. The first pointer is kept at the
start of the array, as the iterating pointer iterates through the rest of the array. There
is also a counter to track the count of duplicates of a particular number. Whenever a new
number is encountered, or a duplicate of the current number is found, it is stored at the
low pointer. This is successively done till the iterating pointer traverses the whole array,
after which the low pointer will hold the adjusted array.

Did this run on leetcode: Yes

*/
class Solution {
    
    
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public int removeDuplicates(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return 0;
        
        if(nums.length == 1)
            return 1;
        
        int low = 1, count = 1;
        
        for(int i = 1; i < nums.length; i++)
        {   //Duplicate check
            if(nums[i] == nums[i - 1])
                count++;
            //Reset if we find a new number
            else
                count = 1;
            
            if(count <= 2)
            {
                nums[low] = nums[i];
                low++;
            }
        }
        
        return low;
       
    }
}