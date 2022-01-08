// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1; // it will be the position where to insert another value
        int j=1;    // this will be incremented till it less than nums.length
        int counter =1; //counter starting from 1 as considering we have chacked 1st position 
        
        while(j<nums.length){
            if(nums[j]==nums[j-1]){     // if 0th and 1st index values are equal then only counter is incrementing
                counter++;
            }else{
                counter=1;              // if the values are different we will reset counter to 1.
            }
            
            if(counter<=2){         //every time checking if the counter is 1 or 2 if counter is 1 we will insert value only once 
                                        //and if the counter is 2 we insert value of j into i 2 times
                nums[i]=nums[j];
                i++;
            }   
            j++;                    //every time incremeting j
        }
        return i;
    }
}