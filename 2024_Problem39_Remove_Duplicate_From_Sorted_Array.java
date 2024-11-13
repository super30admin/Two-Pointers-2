//80. https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
//Time Complexity: O(n)
//Space Complexity: O(1)

//using count variable to handle 'k'
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 2;
        int fast = k;
        int slow = k;

        while(fast < n){
            if(nums[fast] != nums[slow-k]){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}


//Time Complexity: O(n)
//Space Complexity: O(1)
//Using boolean duplicate
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0, fast = 1;
        Boolean duplicate = false;

        while(fast < nums.length){
            if(nums[slow] == nums[fast] && !duplicate){
                duplicate = true;
                nums[++slow]=nums[fast];
            }
            else if(nums[slow] != nums[fast]){
                duplicate = false;
                nums[++slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;
    }
}