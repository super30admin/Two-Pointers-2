//TC : O(N) SC: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return -1;
        int sp=1;
        int fp =1;
        int count =1;

        while(fp<nums.length)
        {
            if(nums[fp-1] == nums[fp])
                count++;
            else
                count = 1;

            if(count<=2)
            {
                nums[sp] = nums[fp];
                sp++;
                fp++;
            }
            else
                fp++;


        }
        return sp;

    }

}