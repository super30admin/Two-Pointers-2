
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*Leveraging a 2 pointer approach.
The first pointer traverses throught the complete array and we keep track of the particular element where we are at.
The second pointer is used to keep trak of the location where the next valid should be
As soon as the element changes we set count to 1.
Also along with this keep copying element from the location of the first pointer to the location of the second pointer till the count is <=2.
*/
// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int j = 1;
        int count = 1;
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count <=2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
