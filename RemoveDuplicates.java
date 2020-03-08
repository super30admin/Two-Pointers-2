//constant space and linear time
//passed all leetcode cases
//used approach discussed in class
class Solution {
    public int removeDuplicates(int[] nums) {
        //edge case
        if(nums == null ||nums.length==0) return 0;
        if(nums.length ==1) return 1;
        int slow=0;
        int fast =1;
        boolean flag=false;
        while (fast<nums.length){
            if(nums[slow]==nums[fast]){
                if(!flag){
                    flag=true;
                    slow++;
                    nums[slow] = nums[fast];
                    fast++;
                }
                else {
                    while(fast<nums.length && nums[fast]==nums[fast-1])fast++;
                }

            }else{
                flag = false;
                slow++;nums[slow]=nums[fast];
                fast++;
            }
        }
        return slow+1;
    }
}