// Time Complexity: O(n) 
// Space Complexity: O(1)

// Count var is used to keep the count of duplicates until 2. After that it is set to 0.
// and another location pointer is used to swap the right elements with left.
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] { 1, 1, 1, 2, 2, 3 }));
    }

    private static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int count = 0;
        int n = nums.length;
        int point = 0;
        for (int num = 0; num < n; num++) {
            count = (count == 0 || count > 0 && nums[num] == nums[num - 1]) ? count + 1 : 1;
            if (count <= 2) {
                nums[point] = nums[num];
                point++;
            }
        }
        return point;
    }

}