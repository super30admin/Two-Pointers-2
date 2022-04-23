// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Two Pointer approach - left pointer which holds the position where the element needs to be inserted
// right pointer for traversing the array used alongside count

// Your code here along with comments explaining your approach
public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        // k = 2;
        if(nums.length == 0){
            return -1;
        }

        int left = 1;
        int right = 1;
        int count = 1;

        while(right <= nums.length - 1){

            if(nums[right] == nums[right - 1]){ // Compare with right with previous element

                count++;                        // same

                if(count <= 2){
                    nums[left] = nums[right];
                    left++;
                    right++;
                }else{
                    right++;
                }

            }else{              // New element occured
                count = 1;
                nums[left] = nums[right];
                left++;
                right++;
            }

        }

        return left;
    }
}
