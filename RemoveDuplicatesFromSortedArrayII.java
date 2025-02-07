// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Use fast pointer and slow pointer. Slow for collecting the numbers and Fast for going to next unique element.
We use count variable to count number of same elements. If count is <=2 then we update the slow pointer and move slow to next
else we just make count back to 1.
*/
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int slow=1;
        int count=1;
        for(int i=1;i<n;i++){
            
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count<=2){
                nums[slow]=nums[i];
                slow++;
            }
        }
        return slow;
    }
}
