//Time Complexity: O(n)
// Space Complexity : O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=1;
        int counter=1;
        
        while(j<nums.length){
            if(nums[j]==nums[j-1])
                counter++;
            else
                counter=1;
            if(counter<=2){
                nums[i]=nums[j];
                ++i;
            }
            ++j;
        }
        return i;
    }
}
