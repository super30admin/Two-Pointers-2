//Time Complexity:O(N)
//Space Complexity:O(1)
//In this problem, I'll have a get index function, which will tell me in which direction I should move and how many steps. I'll return false if the array length is less than 2. I'll be having 2 pointers, a slow pointer which will be pointing to the index I'm currently in and a fast pointer, which will be 2 jumps ahead of it. When my slow and fast pointers are equal, I'll check, if it is the same step that i arrived before(loop of size 1). In that vcase, I'll return false. Else I'll return true. If I have not found a loop, I'll retrace and mark all the elements along the way to 0. 
//This program was executed successfully and got accepted in leetcode.


class Solution {
    public boolean circularArrayLoop(int[] nums) {
        if(nums.length<2){
            return false;
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            int slow=i,fast=getIndex(i,nums);
            while(nums[i]*nums[fast]>0&&nums[getIndex(fast,nums)]*nums[i]>0){
                if(slow==fast){
                    if(slow==getIndex(slow,nums)){
                        break;
                    }
                    return true;
                }
                slow=getIndex(slow,nums);
                fast=getIndex(getIndex(fast,nums),nums);
                
            }
            slow=i;
            int val=nums[i];
            while(nums[slow]*val>0){
                int next=getIndex(slow,nums);
                nums[slow]=0;
                slow=next;
            }
            
        }
        return false;
    }
    public int getIndex(int i,int[] nums){
        int n=nums.length;
        if(i+nums[i]>=0){
            return (i+nums[i])%n;
        }
        else{
            return (n+((i+nums[i])%n));
        }
    }
}