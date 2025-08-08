// This solution uses two pointer approach where we have a slow pointer pointing to the start of element and fast pointer which points to the running index. We move the element to slow pointer if the running count is within k or range and just increment it if its not
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=2;
        int i=k, j=k;
        while(j<nums.length) {
            if(nums[i-k]!=nums[j]) {
                nums[i++] = nums[j];
            }
            j++;
        }

        return i;
    }
}
