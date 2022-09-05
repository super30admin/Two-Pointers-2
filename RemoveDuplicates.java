/*
Time Complexity - O(n)
Space Complexity - O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0 ) return 0;
        if(nums.length == 1) return 1;
        int slow = 1;
        int fast = 1;
        int count = 1;
        
        for(int i=fast; i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count ++;
            }
            else{
                count = 1;
            }
            if(count <=2){
                nums[slow] = nums[i];
                slow ++;
            }
        }
        
        return slow;
    }
}
