// Time Complexity : O(n) iterating over the elements in the array only once
// Space Complexity : O(1) no auxilary data structure used for processing
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        //null check 
        if( nums == null || nums.length == 0 ) return 0;
        int j = 1; int count = 1; //initializing the variables 
        
        for( int i = 1; i < nums.length; i++ ) { //running over all the elements
            if( nums[i] == nums[i-1] ) { //comparing if the curr is equal to prev
                count++; //incrementing count if the elements are same
            }
            else {
                count = 1; //if not resetting the count to 1
            }
            if( count < 3 ) { //until the count reaches 3
                nums[j] = nums[i]; //swapping elements
                j++; //once swapped moving j to next position
            }
        }
        return j; // because first few slots will have answer array
    }
}