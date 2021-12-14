//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 0;
        int prev = Integer.MIN_VALUE;
        boolean seen = false;
        while(right<nums.length){
            if(prev!=nums[right]){
                prev = nums[right];
                swap(nums,left++,right);
                seen = false;
            }
            else if(!seen){
                swap(nums,left++,right);
                seen = true;
            }
            right++;
        }
        return left;
    }
    public static void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j] = temp;
    }
} 