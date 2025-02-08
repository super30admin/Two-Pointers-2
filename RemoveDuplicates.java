// Overall Time Complexity : O(n) . The time taken to traverse the elements in the array.
// Overall Space Complexity : O(1) . There no extra space taken in the problem.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation


// This solution removes duplicates using a two-pointer approach with fast and slow pointers.  
// If the current element matches the previous one, we increment the count.  
// If the count is less than 2, we copy the element at the fast index to the slow index and increment the slow pointer.  
// When a new element is encountered, the count is reset to 1.

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int slow = 1;
        int count = 1;
        for(int i =1; i< nums.length;i++){
                if(nums[i]==nums[i-1]){
                    count++;
                }
                else{
                    count = 1;
                }
                if(count<=2){
                    nums[slow] = nums[i];
                    slow++;
                }
        }
        return slow;
    }
    
}
