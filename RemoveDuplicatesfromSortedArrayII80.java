class Solution {
    public int removeDuplicates(int[] nums) {
    if(nums == null || nums.length == 0){
        return 0;
    }
    int j = 2;
    for(int i =0 ; i<nums.length; i++){
        if(i>1 && nums[j-2] != nums[i]){
              nums[j++] = nums[i];
        }
    }
        return j;
}
}
