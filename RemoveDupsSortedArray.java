// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        int p=0;
        int count=1;

        for(int i=1; i<n; i++)
        {
            if(nums[i]==nums[i-1])
                count++;
            else
                count=1;

            if(count<=2)
            {
                p++;
                nums[p] = nums[i];
            }
        }

        return p+1;

    }
}
