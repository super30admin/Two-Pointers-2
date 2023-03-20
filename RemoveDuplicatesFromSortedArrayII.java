//Leetcode - 80
//Time Complexity - O(N)
//Space Complexity - O(1)
public class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        int slow = 1;
        int count =1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            } else {
                count =1;
            }
            if(count <=2) {
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}
