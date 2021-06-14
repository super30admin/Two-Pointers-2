// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int sptr = 1;
        
        int n = nums.length;
        
        for(int i=1; i<n; i++){
            
            if(nums[i] != nums[i-1]){
                count = 1;
            } else count++;
            
            if(count <= 2){
                nums[sptr] = nums[i];
                sptr++;
            }
            
        }
        return sptr;
    }
}