//Time Complexity: O(n)
//Space Compelxity:O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int bp=1;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                nums[bp]=nums[i];
                bp++;
            }
        }
        return bp;
    }
}