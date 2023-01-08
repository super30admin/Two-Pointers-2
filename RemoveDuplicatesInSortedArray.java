// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Approach: We use a slow pointer and a fast pointer(for loop index iterator).
// Start slow and i at index 0 or 1, if you start at 0 you need to add extra condition if(i>0).
// k is the number of allowed occurences
// Check if current element is same as prev element, if it is same increment count else reset the count to 1
// then check if count <=k, if so then replace the element at the slow pointer with ith element
// Move the slow pointer ahead
// Return the value where slow pointer finished because the elements after that are not considered

class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums==null || nums.length==0) return 0;
        int k=2; //meaning we can have 2 reps of the same number
        int slow=0;
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            if(i >0 && nums[i]==nums[i-1]){
                count++;
            } else { 
                count=1; //we found new element
            }
            if(count <=k){ 
                nums[slow]=nums[i]; //replace the slow pointer value with ith value
                slow++; //move slow pointer ahead
            }
        }
        return slow; //where slow stops is the bounday element in the array i.e. elements after this are not considered
    }
}