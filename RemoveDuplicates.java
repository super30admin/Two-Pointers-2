/**Leetcode Question - 80 - Remove Duplicates from Sorted Array II */
/**Algorithm - Two Pointer
 * Take a slow and a fast pointer starting from index 1 and set count =1;
 * If the element at nums[fast] == nums[fast-1] and count <=2, nums[slow] = nums[fast] and increment the counter.
 * return slow at the last
 */
/**TC - O(N)
 * SC - O(1)
 */
public class RemoveDuplicates {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int slow = 1;
            int fast =1;
            int count =1;
            while(fast<nums.length){
                if(nums[fast] == nums[fast-1]){
                    count++;
                }
                else{
                    count = 1;
                }
                if(count<=2){
                    nums[slow] = nums[fast];
                    slow++;
                }
                fast++;
            }
            return slow;
        }
    }
}
