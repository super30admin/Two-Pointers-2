//time - O(n)
//space - constant
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }
        
        //the first 2 elements will always be in the result
        //so start filling from index 2
        int current = 2;
        
        //invariant - if the cursor element is same as current - 2 then it implies that the cursor has already occured twice
        //else add it in current index and increment current
        for(int next = 2; next < nums.length; next++)
        {
            if(nums[next] == nums[current - 2])
            {
                continue;
            }
            else
            {
                nums[current] = nums[next];
                current++;
            }
        }
        
        return current;
    }
    
    //removes duplicates from sorted array with no other conditions
    //time - linear, space - constant
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }
        
        //the first element will always be in the result so start from 2nd element
        int current = 1;
        
        //from the 2nd element, if it is same as prev element continue 
        //else place it in current and increment current by 1
        
        for(int next = 1; next < nums.length; next++)
        {
            if(nums[next] == nums[current - 1])
            {
                continue;
            }
            else
            {
                nums[current] = nums[next];
                current += 1;
            }
        }
        
        return current;
    }
}
