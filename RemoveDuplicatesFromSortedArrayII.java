//  Time Complexity: O(n)
//  Space Complexity: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3) return nums.length;
        int i=0;
        int count = 1;
        int k = 2;
        for(int j=1; j< nums.length; j++){
            if(nums[i] == nums[j]){
                count++;
            }
            else{
                count = 1;
            }
            if(count <= k){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}