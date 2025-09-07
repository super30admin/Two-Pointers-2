class Solution {
    public int removeDuplicates(int[] nums) {
        int count =1;
        int slow = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count <= 2){
                nums[slow]=nums[i];
                slow++;
            }
        }
        return slow;
    }
}

//tc:O(n)
//sc:O(1)