
// Time Complexity : O(m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach - we are using 2 pointers approach here,
// at each point we check if we have reached the given count, if not we add one more to count and
//add it to the array. If not we update fast.


/**
 * RemoveDuplicates : RemoveDuplicates
 *
 * @author : Kavya Mandaliya
 * @version : 1.0 (Nov 11, 2024)
 * @since : 1.0 (Nov 11, 2024)
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int fast = 0, slow = 0;
        int x = 0, k = 2;
        while(fast < nums.length){
            if(fast > 0 && nums[fast] == nums[fast-1]){
                x++;
            }else{
                x = 1;
            }
            if(x <= k){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;

        }
        return slow;
    }

}
