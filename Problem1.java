//Time Complexity O(n)
//Space Complexity O(1)
// Did this code successfully run on Leetcode : Yes

Class Solution {
    public int removeDuplicates(int[] nums) {

        //Checking for empty array condition
        if(nums == null || nums.length == 0)
        return 0;
        //declaring initials
        int n = nums.length;
        int k = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(i == 0 || nums[i] != nums[i-1]){
                count = 1;
            }else{
                count++;
            }
//checking for duplicates upto 2, if more than 2 then it will not consider
            if(count <= 2){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
