public class RemoveDuplicates {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int resultItr = 1;
            int count = 1;
            int duplicatesAllowed = 2;
            for (int itr = 1; itr < nums.length; itr++) {
                if (nums[itr] != nums[itr - 1]) {
                    count = 1;
                } else {
                    count++;
                }
                
                if (count > duplicatesAllowed) {
                    continue;
                } else {
                    nums[resultItr] = nums[itr];
                    resultItr++;
                }
            }
            return resultItr;
        }
    }
}
