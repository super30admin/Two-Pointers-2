// Time: O(N)
// Space: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0; int fast = 1;
        int count = 0 ;
        int res = 0;
        while(fast< nums.length){
            count = 0 ;
            if(nums[slow] == nums[fast]){
                ++fast;
            }
            if(nums[slow]!= nums[fast]){
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                ++fast;
                ++ slow;
                ++ res;
            }
        }
        return res;

    }
}