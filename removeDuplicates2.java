/*
Time complexity : O(n)
Space complexity: O(1)
*/
public class removeDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int i = 1; // track next insertion
        int j = 1; // current position in nums
        int count = 1;
        while(j < nums.length) {
            if(nums[j] == nums[j-1]) {
                count++;
            } else {
                count = 1;
            }
            
            //add the value until the count is 2
            if(count <= 2) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}