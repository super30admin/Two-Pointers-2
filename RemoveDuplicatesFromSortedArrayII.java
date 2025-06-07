
// Time Complexity: O(n),
// Space Complexity: O(1),

class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int curIndex = 1;
        int freq = 1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[j - 1]) {
                freq++;
            } else {
                freq = 1;
            }

            if (freq <= 2) {
                nums[curIndex++] = nums[j];
            }
        }

        return curIndex;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArrayII sol = new RemoveDuplicatesFromSortedArrayII();

        int[] nums = {1, 1, 1, 2, 2, 3};
        int newLength = sol.removeDuplicates(nums);

        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
