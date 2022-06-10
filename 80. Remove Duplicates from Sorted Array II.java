// Time Complexity : O(n)
// Space Complexity : O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0, j=1;
        int count=1;
        while(j<nums.length){
            if(nums[j]==nums[j-1]){
                count++;
                if(count>2){
                    j++;
                }
                else{
                    nums[i+1]=nums[j];
                    i++;
                    j++;
                }
            }
            else{
                count=1;
                nums[i+1]=nums[j];
                j++;
                i++;
            }
        }
        return i+1;
    }
}