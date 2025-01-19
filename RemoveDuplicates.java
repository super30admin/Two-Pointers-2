// TC : O (n)
// SC : O (1)

/*
 * Use two pointers - i to keep track of the entire array
 * j to keep track of the result array
 * when nums[i] != nums[j - 2] (not a third instance of the number)
 * copy nums[i] to nums[j], increment both
 * else just increment i
 * return j as that is the number of valid entries finally
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 2;
        int j = 2;
        int l = nums.length;
        if (l <= 2) return l;
        while (i < l) {
            if (nums[i] != nums[j - 2]) {
                nums[j++] = nums[i];
            }
            i++;
        }
        return j;
    }
}
