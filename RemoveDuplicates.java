/*the time complexity of the implementation below is O(n)*/
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int i = 0;
        int count = 1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[i]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        Solution solution = new Solution();
        int k = solution.removeDuplicates(nums);
        System.out.println("Length of array after removing duplicates: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
