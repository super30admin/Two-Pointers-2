class removeDuplicateFromSortedArray{
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int slow = 1;
        int count = 1;

        for(int fast = 1; fast < nums.length; fast++){
            if(nums[fast] == nums[fast - 1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count <= 2){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
    public static void main(String[] args) {
        removeDuplicateFromSortedArray rd = new removeDuplicateFromSortedArray();
        int[] nums = {1,1,1,2,2,3};
        System.out.println(rd.removeDuplicates(nums));
    }
}