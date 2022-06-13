//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length;
        
        //null case check
        if(nums == null) return 0;
        
        //this will point to different elements oq1
        int pointer = 1;
            
        int count = 1;
        
        //looping from the second element to the last
        for (int i = 1; i < n; i++)
        {
            //if the element at the i'th position is equal to the previous element
            if (nums[i] == nums[i - 1])
            {
                //we increment the counter
                count++;
            }
            
            //if the previous element is not the same i.e. we have moved to a new element
            else
            {
                //we set the counter to 1 again
                count = 1;
            }
            
            //if the count is greater than or equal to 2
            //we replace the value at pointer with our current value
            if (count <= 2)
            {
                nums[pointer] = nums[i];
                //and move the pointer to the next element
                pointer++;
            }
        }
        //[1,1,1,2,2,3] 
        return pointer;
    }
}