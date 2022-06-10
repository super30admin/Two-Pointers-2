//Time complexity: O(n)
//Space complexity: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int slow=1;
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                cnt++;
            } else{
                cnt=1;
            }
            if(cnt<=2){
                nums[slow]=nums[i];
                slow++;
            }
        }
        return slow;
    }
}
