public class RemoveDuplicate {
    // TC is O(n)
    // SC is O(1)
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int slow = 1;
        int count = 1;
        for(int f=1; f<nums.length;f++){
            if(nums[f] == nums[f-1]){
                count++;
            }else{
                count = 1;
            }
            if(count<=2){
                nums[slow] = nums[f];
                slow++;
            }
        }
        return slow;
    }
}
