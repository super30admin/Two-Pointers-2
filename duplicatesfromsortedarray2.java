class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0 || nums==null)    return 0;
        int count=1; int j=1; int k=2;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(k>=count)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
//time complexity : O(n)
//space complexity: O(1)