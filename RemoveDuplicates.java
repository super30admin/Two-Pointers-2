/*TC - O(N)
 * SC-O(1)  - no auxiliary space used
 * Ran on leetcode - yes
 *
 * */

// Approach - Count the occurence of elements as we traverse and if the count is 2, retain it via using a pointer pos , else ignore
class Solution {
    public int removeDuplicates(int[] nums) {
     
        int pos = 1 ; 
        int count = 0 ; 
        for (int i = 1 ; i < nums.length; i++){
            if (nums[i-1] != nums[i]){
                // reset counter as we found a distinct element
                count = 0;
                
            } else {
		    // inc counter 
                count +=1;
                
            }
            if (count <= 1){
		    // If the ount of element is 2 and above, we ignore the element and only relatin the ones which are found twice
                nums[pos] = nums[i];
                pos +=1;
            }
        }
        return pos;
    }
}





