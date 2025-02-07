//The approach here is to use two pointers, fast and slow. The slow pointer collects the numbers as per the requirement, which here is count<=2, and the fast pointer is used to move to the next unique number
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int slow = 1;
        int count = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                count++;
            } else{
                count = 1;
            }
            if(count<=2){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}