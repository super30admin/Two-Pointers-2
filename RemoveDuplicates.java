// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Here we are using two pointers fast and slow.
class RemoveDuplicates{
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int slow = 0;
        ///int fast = 1;
        int count =1;
        for(int fast = 1; fast < nums.length; fast++){
            if(nums[fast] == nums[fast-1]){
                count++;
            }else{
                count=1;
            }
            if(count<=2){
                slow++;
                nums[slow] = nums[fast];
            }
        }
    return slow+1;
    }
}