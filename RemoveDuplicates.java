// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
//Have one pointer marking the sorted index, while another pointer scans the count of the current number by comparing to its left neighbor. 
//Sorted index is incremented everytime count is less than 2. 

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int slowPointer = 1, count = 1;
        for(int fastPointer = 1; fastPointer < nums.length; fastPointer++){
            if(nums[fastPointer] == nums[fastPointer-1]){
                count++;
            }else{
                count = 1;
            }
            
            if(count <= 2){
                nums[slowPointer] = nums[fastPointer];
                slowPointer++;
            }
        }
        
        // System.out.println("Nums : " + Arrays.toString(nums));
        return slowPointer;
    }
}