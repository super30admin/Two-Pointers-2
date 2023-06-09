// Time Complexity o(n) space complexity o(1);
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow=0,count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] ==  nums[i]) count++;
            else count=1;
            if(count<=2){
                slow++;
                nums[slow]=nums[i];
            }
        }
        return slow+1;

    }
}
