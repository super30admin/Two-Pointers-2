//Time Complexity : O(n)
//Space Complexity : O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        //base base
        if(nums == null && nums.length == 0){
            return 0;
        }
        
        //2 pointers slow and fast
        int slow=0, fast=1;
        Boolean duplicate = false;
        
        //till fast reaches last element
        while(fast < nums.length){
            
            //if slow and slow+1(fast) is equal
            if(nums[slow] == nums[fast] && !duplicate){
                duplicate = true;
                nums[++slow]=nums[fast];
            }
            //is slow and fast not equal
            else if(nums[slow] != nums[fast]){
                duplicate = false;
                nums[++slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;
    }
}