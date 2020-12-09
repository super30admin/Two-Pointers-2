
// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
      if(nums == null || nums.length ==0)
          return 0;
        int j = 1, count = 1;
        for(int i = 1;i<nums.length;i++){
            //If currentelement is equal to previous element increment count
            if(nums[i] == nums[i-1]){
                count++;
            }
            //Compare if ith value is equal to j unless count <= 2
            else{
                count = 1;
            }
            // if current element is less than two assign to jth value 
            if(count<=2){
                nums[j] = nums[i];
                j++;
            }
            
        }
        return j;    
    }
}