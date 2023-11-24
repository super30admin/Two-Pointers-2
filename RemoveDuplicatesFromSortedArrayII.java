// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
public class RemoveDuplicatesFromSortedArrayII {
    //tried another approach
    public int removeDuplicates(int[] nums) {
        if(nums.length == 2)
            return nums.length;

        int slow = 2;
        for(int fast = 2; fast < nums.length; fast++){
            if(nums[fast] != nums[slow-2]){
                nums[slow] = nums[fast];
                slow++;
            }
            else
                continue;


        }
        return slow;
    }
    public int removeDuplicates2(int[] nums) {
    // more generalised with variation in k

        int k = 2;
        int slow = 0; int count = 1;
        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }

            if(count <= k){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}
