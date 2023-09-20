
//T.C  : O(n)
//S.C : O(1)
// Passed all Test cases on Leetcode : Yes
// Any issues faced while executing the code : No

public class Problem1 {
    public int removeDuplicates(int[] nums) {

        int slow_ptr =1 ;
        int count =1;
        for(int i=1;i<nums.length;i++){

            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count=1;
            }

            if(count <=2){
                nums[slow_ptr] = nums[i];
                slow_ptr++;
            }

        }

        return slow_ptr;


    }
}
