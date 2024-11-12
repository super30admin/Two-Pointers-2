// time complexity - O(n) as we traverse the array once
// space complexity - O(1)
// ran on leet code: yes
// Problem encountered: No
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        int slow = 0;
        int count = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (fast == 0 || nums[fast] != nums[fast - 1]) {
                count = 1; // Initialize count for a new element

            } else {
                count++; // increment count for duplicate element
            }

            if (count <= 2) {
                nums[slow] = nums[fast];// copy nums[fast] to nums[slow] if k<2, more than 2 numbers willbe skipped
                slow++;
            }
        }
        return slow;

    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

            int[] nums = {1, 1, 1,2, 2, 3};
            int newLength = solution.removeDuplicates(nums);

            System.out.println("Modified array length: " + newLength);
            System.out.print("Modified array: ");
            for (int i = 0; i < newLength; i++) {
                System.out.print(nums[i] + " ");
        }
    }
}
