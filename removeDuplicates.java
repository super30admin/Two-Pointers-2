//Time complexity = O(n) n = lenth of array;
//Space complexity = O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int p1 = 1;
        int k = 2;
        int count = 1;

        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count <= k){
                nums[p1] = nums[i];
                p1++;
            }
        }
        return p1;
    }
}