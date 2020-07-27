/*

// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
  //since array sorted, maintain a count for each new int.
  //while count is < 2 copy elem to strt pointer location.
  //increment strt pointer on each write.
// Your code here along with comments explaining your approach

*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int strt = 0;
        int cnt = 0;

        for(int i = 0 ; i < nums.length; i++){
            //new number normalize count.
            if(i > 0 && nums[i] != nums[i-1])
                cnt = 0;

            //count less than 2 , copy elem.
            if(cnt < 2)
                nums[strt++] = nums[i];
            cnt++;
        }
        return strt;
    }
}
