//TC = O(n)
//SC = O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int slow = 0;
        if(nums == null || n == 0) return slow;
        int cnt = 1; 
        for(int i = 1; i < n; i ++)
        {
            if(nums[i] == nums[i-1]) cnt++;
            else
            {
                cnt = 1;
            }
            if(cnt <=2 )
            {
                slow++;
                nums[slow] = nums[i];
            }
        }
        return slow + 1;
    }
}