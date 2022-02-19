/**
nums = [1,1,2,2,3,2,2,3]
                  s       e

[0,0,1,1,2,2,1,1,2,3,3]
             s   e       


[0,0,1,1,2,3,3,_,_] k = 7.


 [0,0,0,0,1,1,2,1,1,3,3]
            s   e
            
TC - O(n) since traversing an array in single pass
SC - O(1) in constant time.


**/
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int placeHolder = 1;
        int count = 1;
        
        for (int runPtr= 1; runPtr<nums.length; runPtr++)
        {
            if (nums[runPtr] == nums[runPtr-1])
            {
                count++;
            }
            else
            {
                count = 1;
            }
            
            if (count <= 2)
            {
                nums[placeHolder++] = nums[runPtr];
            }
        }
        
        return placeHolder;
    }
}