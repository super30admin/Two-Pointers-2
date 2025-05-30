// TC -- O(N) -- Traverse the whole array only once;
// SC -- O(1) -- No extra storage is used only variables are used which are constant
// Approach:
// We use two pointer approach where we use 1 pointer to update and the other to pass.
// We override the value only when we have the condition met where the repeated element is not greater than 2.
// After updating both the pointers value is updated by 1;

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k=2,count=0;
        int l=0,r=0;
        while(r < n){
            if  (r > 0 && nums[r] == nums[r-1] ){
                count++;
            } else{
                count = 1;
            }
            if(count <= k){
                nums[l++] = nums[r];
            }
            r++;
        }
        return l;
    }
}
