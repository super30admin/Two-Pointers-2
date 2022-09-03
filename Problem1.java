// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/**
 * We are doing a two pointer approach, one is slow that keeps the count of number of elements repeating twice,
 * and we have pointer fast that checks for duplicate elements.
 */

// Your code here along with comments explaining your approach
public class Problem1 {

    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        int count =1; //to count the frequency

        int slow =1;
        //int fast = 1;
        for(int fast =1; fast<n; fast++){

            if(nums[fast] == nums[fast-1])
            {
                count++;

            }
            else{
                count=1;
            }

            if(count<=2){
                nums[slow] = nums[fast];
                slow++;

            }

        }
        return slow;



    }
}
