//Time Complexity:O(N)
//Space Complexity:O(1)
//In this problem, I'll be having four pointers, previous, flag, slow and fast. Initially my flag and previous pointers will be 0 where as slow and fast will be pointing to the first index. If my fast element is equal to my previous, I'll check if the flag is 0. In that case, I'll simply increment my slow and fast pointers and set the flag to 1. If my flag is 1, I'll just increment my fast pointer. If I have encountered a new element, I'll make the previous to be my fast element and assign the fast element to the slow element and increment both fast and slow pointers and set the flag to 0.
//This code was executed succesfully and got accepted in leetcode.
class Solution {
    public int removeDuplicates(int[] nums) {
        int prev=0;
        int flag=0;
        int slow=1;
        int fast=1;
        while(fast<nums.length){
            if(nums[fast]==nums[prev]){
                if(flag==0){
                    nums[slow]=nums[fast];
                    slow++;
                    fast++;
                    flag=1;
                }
                else{
                    fast++;
                }
            }
            else{
                prev=fast;
                nums[slow]=nums[fast];
                fast++;
                slow++;
                flag=0;
            }
        }
        return slow;
    }
}