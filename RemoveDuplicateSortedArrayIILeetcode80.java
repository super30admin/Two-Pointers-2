//Time Complexity :O(N)
//Space Complexity :O(1)
//Leetcode : Yes
public class RemoveDuplicateSortedArrayIILeetcode80 {
        public int removeDuplicates(int[] nums) {
            if (nums == null) return 0;

            int index = 1;
            boolean alreadySeen = false;
            for (int i = 1; i < nums.length; i++) {

                if (nums[i] == nums[i-1] && alreadySeen) {
                    continue;
                } else if (nums[i] == nums[i-1]) {
                    nums[index] = nums[i];
                    index++;
                    alreadySeen = true;
                } else {
                    nums[index] = nums[i];
                    index++;
                    alreadySeen = false;
                }
            }
            return index;
        }

}
