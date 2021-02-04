// Time complexity - O(n)
// Works on leetcode

class Solution {
    public int removeDuplicates(int[] nums) {
        if ((nums == null) || (nums.length == 0)){
            return 0;
        }
        int count = 1;
        int i = 1;
        int j = 1;
        while(i < nums.length)
        {
            if(nums[i] == nums[i-1]){
                count = count + 1;
            }
            else{
                count = 1;
            }
            if(count <= 2){
                nums[j] = nums[i];
                j = j + 1;
            }
            i = i + 1;
        }
        return j;
    }
}
