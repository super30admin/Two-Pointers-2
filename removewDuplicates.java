// Time Complexity : O(n)
// Space Complexity :O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1, cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                cnt++;
            }else{
                cnt=1;
            }
            
            if(cnt<=2){
                nums[j++]=nums[i];
            }
        }
        return j;
        
    }
}