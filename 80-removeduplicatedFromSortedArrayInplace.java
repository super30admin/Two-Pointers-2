/** LC-80
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No.
 *Algo:
 * We can apply this algo for k duplicates. For this question k = 1., so count <= 2 ... [1,1,2] count = 2 for 1, 1 duplicate allowed so k = 1
 1. start i and j from 1 (because 0th element is already unique)
 2. count = 1;
 3. we will iterate i on the whole array.
 4. Increment count whenever a duplicate number is found
 5. Reset count when 1st unique element is found
 6. if (count<=2) replace jth value with ith value.
 7. j would represent the length of the required array, so return it.
 */
package TwoPointers;
//K duplicates allow
public class removeDuplicatesFromArrayInplace {
    public int removeDuplicates(int[] nums) {

        // [1,1,1,1,2,2,3,4]

        if(nums == null || nums.length == 0) return 0;

        if(nums.length == 1) return 1;

        int j = 1;
        int count = 1;
        for(int i =1; i< nums.length; i++){

            if(nums[i - 1] == nums[i]){
                count++;
            }
            else{
                count =1;
            }
            if(count <= 2){  //if no duplicate allowed it would be count<=1
                nums[j] = nums[i];
                j++;
            }
        }

        return j;

    }
}