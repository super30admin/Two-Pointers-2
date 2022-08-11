

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// the fast and the slow pointers are taken and the duplicates are replaced whenever the count is greater than the index
// We will only check consecutive duplicate values and process accordingly

// Your code here along with comments explaining your approach
import java.util.Arrays;

public class removeDuplicates {
    public static void main(String args[]) {
        int[] nums = {0,0,1,1,1,1,2,2,2,3,3,4,5,5,5};
        int slow = 1;
        int count = 1;
        int k = 2;
        for(int fast = 1;fast < nums.length; fast++) {
            if(nums[fast] == nums[fast-1]) {
                count++;
            }
            else
                count = 1;
            
            if(count < k+1) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        System.out.println(slow);
    }
}