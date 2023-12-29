/*
approach-1
hashmap : key as number, freq as value
build a new arraylist based on keyset, 
return the arraylist.size() TC: (n); sc: O(n)
*/

/*
approach -2
two pointers
left and i starts at 1
coiunt is 1
when count is <=2 we update the value of left with i's
else
we keep moving with for loop
once we find nums[i-1] and i are diff, we reset count to 1. 
at last return 0 - left as an array! */
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        
        int count =1;
        int left = 1;
        
        for(int i=1; i < nums.length; i++)
        {
            if(nums[i-1] == nums[i])
            {
                count++;
            }else
            {
                count =1;
            }
            if(count <=2)
            {
                nums[left] = nums[i];
                left++;
            }
        }
        return left;
    }
}