// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//I have used slow and fast pointer approach where both moves when the count is <= 2 and only
// moves by 1 is the count is > 2 and everytime count resets if previous element of fast != current fast.
public class RemoveDuplicateFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;
        int count = 0;

        while(fast<=nums.length-1 && slow <=nums.length-1){

            if(fast>0 && nums[fast]==nums[fast-1]){
                count= count +1;
            } else { count = 1;}

            if(count<=2){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
