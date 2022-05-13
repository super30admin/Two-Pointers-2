import java.util.Arrays;

class RemoveDuplicates {
  // Time Complexity : O(N)
  // Space Complexity : O(1)
  // Did this code successfully run on Leetcode : Yes
  public static int removeDuplicates(int[] nums) {
    if (nums == null || nums.length == 0)
      return 0;
    int freq = 1, j = 1, elem = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == elem)
        freq++;
      else
        freq = 1;
      elem = nums[i];
      if (freq <= 2)
        nums[j++] = elem;
    }
    return j;
  }

  public static void main(String[] args) {

    int[] inputs1 = { 1, 1, 1, 2, 2, 3 };
    int[] inputs2 = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };

    int count1 = RemoveDuplicates.removeDuplicates(inputs1);
    // String actual_output =
    // Arrays.toString(Arrays.stream(nums).limit(count).mapToObj(Integer::toString).toArray());

    System.out.println("Remove duplicates : " + count1);
  }

  // String[] inputs = { "0 0 1 1 1 2 2", "1 2 3", "1 1 1 1 1 1 1 1 1 1 1 1" };
  // for (int i = 0; i < inputs.length; i++) {
  // int[] nums = Arrays.stream(inputs[i].split("
  // ")).mapToInt(Integer::parseInt).toArray();
  // int count = RemoveDuplicates.removeDuplicates(nums);
  // String actual_output =
  // Arrays.toString(Arrays.stream(nums).limit(count).mapToObj(Integer::toString).toArray());

  // System.out.println("Remove duplicates : " + actual_output);
  // }
}
