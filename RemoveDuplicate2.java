
// Time Complexity : O(N) N = length of the array nums 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Keep track of two pointers previous and current which checks 
//for duplicates and a tracker pointer which would return the length of the array after the duplicates are removed.

class RemoveDuplicate2 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        if (nums.length <= 2)
            return nums.length;

        int p = 0;
        int c = 1;
        int i = 1;
        boolean flag = true;

        while (c < nums.length) {

            if (nums[p] == nums[c]) {
                if (flag == true) {
                    nums[i] = nums[c];
                    i++;
                    c++;
                    flag = false;
                } else {
                    c++;
                }
            } else {
                p = c;
                nums[i] = nums[c];
                c++;
                flag = true;
                i++;

            }
        }
        return i;
    }

    public static void main(String args[]) {
        RemoveDuplicate2 obj = new RemoveDuplicate2();
        int nums[] = { 1, 1, 1, 2, 2, 3 };
        System.out.print(obj.removeDuplicates(nums));
    }
}