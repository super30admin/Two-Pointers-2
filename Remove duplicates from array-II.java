//Time complexity: O(n)
//Space complexity: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1, j=1, count=1;
        while(j<nums.length)
        {
            if(nums[j]==nums[j-1]){
                count++;
            if(count<=2)
            {
                nums[i]=nums[j];
                i++;
            }
            }
            if(nums[j]!=nums[j-1])
            {
               
                count=1;
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}