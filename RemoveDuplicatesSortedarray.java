//Time Complexity:O(n)
//Space Complexity:O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null) return 0;
        int count=1,k=2;
        int slow = 0,i=0;

        while(i<nums.length){
            if(i>0 && nums[i] == nums[i-1])
                count++;
            else
                count = 1;
            if(count<=k){
                nums[slow] = nums[i];
                slow++;
                i++;
            }
            else
                i++;
            }
        return slow;
    }
}