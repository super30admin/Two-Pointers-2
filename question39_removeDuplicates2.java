package TwoPointers2;

public class question39_removeDuplicates2 {

    /*
        Two Pointer :
            Time Complexity: O(n)
            Space Complexity: O(1)
    */
    public static int removeDuplicatesTwoPointer(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int count = 1;
        int j = 1;

        for(int i = 1 ; i < nums.length ; i++) {
            if(nums[i] == nums[i -1])   count++;
            else  count = 1;

            if(count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        removeDuplicatesTwoPointer(nums);
    }
}
