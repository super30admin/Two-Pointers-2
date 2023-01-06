// Time Complexity - O(n)
// Space Complexity - O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int slow = 1;
        int fast = 2;
        int count = 1;
        int n = nums.length;
        
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count <= 2){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}