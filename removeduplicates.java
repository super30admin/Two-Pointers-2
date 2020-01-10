// time: O(n) where n=length of array
// space: O(1)
//passed all testcase
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int k=0; // index for modified array
        int i=0;
        nums[k++]=nums[i];
        int count=1; // count variable to allow at most duplicates
        for(i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
                if(count<=2) 
                {
                       nums[k++]=nums[i];
                }
            }
            else{
                count=1; // reset the counter variable
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}