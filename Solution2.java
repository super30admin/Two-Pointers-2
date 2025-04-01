class Solution2 {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i = 1; i < nums.length; i++){
            if(j == 1 || nums[i] != nums[j-2]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

    }
}