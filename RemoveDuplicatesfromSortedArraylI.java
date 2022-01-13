// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: We are taking 2 pointers to keep track of duplicate elements where 1 pointer is to track insertion and other one is to track our current position in array, along with a counter to keep trak of frequency of that element. We are moving our curr pointer till array size and check the conditions if its previous element is equal to our current pointer element if yes then counter will be incremented by one or else it ll be reset to one. Lastly in order to just maintain at most 2 duplicates, we are checking if couter is <= 2, if yes, we replace our curr pointer element at our tracking pointer and increment i and then j by one.

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i = 1; //track insertion
        int j = 1; //current position in array
        
        int counter = 1; //bcz we started from 1'th index
        
        while(j < nums.length){
            
            if(nums[j] == nums[j-1]){
                counter++;
            } else{
                counter = 1;
            }
            
            if(counter <= 2){
                nums[i] = nums[j];
                i++;
            }
            
            j++;
        }
        return i;
    }
}