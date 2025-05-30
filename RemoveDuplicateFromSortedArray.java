// TC: O(n)
// SC: O(1)
// Approach: Maintain 2 pointers left and right swap the elements in place 
// left side will have all elements and right pointer will keep a track of count 
// At every intsance of new element count will reset to 1 
// At the end return the index of left

public class RemoveDuplicateFromSortedArray {
  public int removeDuplicates(int[] nums) {
    int left = 1;
    int count = 1;
    int k = 2;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        count++;
      } else {
        count = 1;
      }
      if (count <= k) {
        nums[left] = nums[i];
        left++;
      }
    }
    return left;
  }

  public static void main(String[] args) {
    RemoveDuplicateFromSortedArray rda = new RemoveDuplicateFromSortedArray();
    int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
    System.out.println(rda.removeDuplicates(nums));
  }
}
