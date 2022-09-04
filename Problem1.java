class Problem1 {
    public int removeDuplicates(int[] nums) {
        int target = 2;
        int slow = 1;
        int count = 1;
        for(int fast = 1; fast<nums.length; fast++){
            if(nums[fast] == nums[fast-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=target){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}