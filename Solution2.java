// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
class Solution {
    public int removeDuplicates(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        int count = 1;
        while(p2<=nums.length-1)
        {
            if((p2 > 0)&&(nums[p2-1] == nums[p2])){
                if(count < 2 )
                {
                    nums[p1] = nums[p2];
                    p1++; p2++;
                    count++;
                }
                else{
                    p2++;
                    count++;
                }
            }
            else{
                nums[p1] = nums[p2];
                p1++;
                p2++;
                count = 1;
            }
        }
        return p1;
    }
}