//tc = o(n)
//sc = o(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(i == 0 || nums[i-1] == nums[i]){
                count++;
            }
            else{
                count = 1;
            }
            if(count <= 2){
                nums[slow] = nums[i];
                slow++; 
            }
        }
        return slow;
    }
}