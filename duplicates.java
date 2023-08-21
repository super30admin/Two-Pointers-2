// TC: O(n)
// SC: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int s = 0;
        int count = 1;

        for(int f = 1; f< nums.length; f++){
            if(nums[f] == nums[f-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count <= 2){
                s++;
                nums[s] = nums[f];
            }
        }
        return s+1;
    }
}