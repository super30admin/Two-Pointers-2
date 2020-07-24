//TC: O(n), n: length of array
//SC: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 1;
        int fast = 1;
        int prev = 0;
        int flag = 0;
        
        while(fast < nums.length){
            if(nums[fast] == nums[prev]){
                if(flag == 0){
                    nums[slow] = nums[fast];
                    slow++;
                    fast++;
                    flag++;
                }
                else{
                    fast++;
                }
            }
            else{
                prev = fast;
                nums[slow] = nums[fast];
                slow++;
                fast++;
                flag = 0;
            }
            
        }
        return slow;
    }
}
