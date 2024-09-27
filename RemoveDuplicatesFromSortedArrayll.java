// Time Complexity: O(n^2)
// Space Complexity: O(1)
class RemoveDuplicatesFromSortedArrayll {
    public int removeDuplicates(int[] nums) {
        int index=0, left =0, right = 0;

        while(right<nums.length) {
            if(nums[left]==nums[right]) {
                right++;
                continue;
            }
            int count = (right - left)>2?2 : (right-left);
            while(count!=0) {
                nums[index++] = nums[left];
                count--;
            }
            left = right;
        }

        int count = (nums.length - left)>2?2 : (nums.length-left);
        while(count!=0) {
            nums[index++] = nums[left];
            count--;
        }

        return index;
    }
}