//Remove duplicate from the sorted array using two pointers
//Time complexity : O(n)
//Space complexity : O(n)


class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int i = 1, j = 1;
        int count = 1;
        for(i = 1; i <= nums.length-1; i++){
            if(nums[i] == nums[i-1]){
                count = count + 1;
            }else{
                count = 1;
            }
            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}