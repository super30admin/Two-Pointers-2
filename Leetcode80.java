// TC - O(n)
// SC - O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;
        int count = 0;
        int n = nums.length;
        int k =2;
        while(fast< n) {

            if(fast != 0 && nums[fast]== nums[fast-1]) {
                count+=1;
            } else {
                count =1;
            }

            if(count<=k) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast+=1;

            
        }
        return slow;
    }
}