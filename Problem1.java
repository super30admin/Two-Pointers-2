public class Problem1 {
    // Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        //a counter to track how many times the element has occurred.
        int count  = 1;
        int n = nums.length;
        //j holds the index where the i will be replaced with whenever the count of element is less than = 2
        int j = 1;
        for(int i = 1;i < n;i++){
            //if element is equal to prev element inc the count, otherwise reset the count as the element is diff
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count =1;
            }
            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
