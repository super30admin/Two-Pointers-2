public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0 || nums==null) return 0;

        int slow=1;
        int count=1;
        for(int fast=1;fast<nums.length;fast++){
            if(nums[fast]==nums[fast-1]) count++;
            else{
                count=1;
            }

            if(count<=2){
                nums[slow]=nums[fast];
                slow++;
            }
        }

        return slow;
    }
}
