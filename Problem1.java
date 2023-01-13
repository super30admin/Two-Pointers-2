import java.util.*;
class Problem1 {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
        System.out.print(removeDuplicates(nums));
    }
    
    public static int removeDuplicates(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int idx = i;
            int count = 1;
            while (i < nums.length && nums[i - 1] == nums[i]) {
                count++;
                i++;
            }
            for (int j = idx + 1; j < idx + count - 1; j++) {
                nums[j] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length && nums[i] != Integer.MAX_VALUE; i++) {
            ans++;
        }
        System.out.print(ans);
        return ans;
    }
}