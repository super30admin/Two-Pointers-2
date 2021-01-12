/**
 * Time complexity - O(n)
 * Space complexity - O(1)
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int count=1;
        int j=1;

        while(i<nums.length)
        {

            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else
            {
                count=1;
            }

            if(count<=2)
            {
                nums[j]=nums[i];
                j++;
            }

            i++;
        }
        return j;
    }
}