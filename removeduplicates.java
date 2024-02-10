
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: we have a counter and pointer iterate through the array, if the value of the previous element is same increse the counter by 1, if the counter is than k then change the value of pionter to the current value

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
       int slow=0;
       int c=1;
       int m=nums.length;
        for(int i =0; i<m;i++){
            if(i == 0 || nums[i] != nums[i-1]){
                c=1;
            } else{
                c++;
            }
            if(c<=2){
                nums[slow]=nums[i];
                slow++;

            }
        }
        return slow;
    }
}