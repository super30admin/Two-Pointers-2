//Remove Duplicates from Sorted Array II
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution1 {
    public int removeDuplicates(int[] nums) {
        int k=2;
        int slow =1;
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else {
                count=1;
            }
            if(count <= k){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}
