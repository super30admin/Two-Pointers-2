//TC: O(n)
//SC: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int s=1;
        int f=1;
        int count=1;
        while(f!=nums.length)
        {
            if(nums[f-1]==nums[f])
            {
                count++;
            }
            else
            count=1;
            if(count<=2)
            {
                nums[s]=nums[f];
                s++;
            }
            f++;
          
        }
return s;
        
    }
}