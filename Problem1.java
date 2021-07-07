// Time Complexity :O(n) --> beacuse of for loop
// Space Complexity :1
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// have two pointers low at 0 , i at 1. if elemets at low and i are equal the increment low till atmost two same elements.
// Then when elements are not equal replace element at low+1 with ellement at i .
public class removeDuplicates2 {

    public static int removeDuplicates(int[] nums) {
        if(nums.length<=2)
            return nums.length;
        else{
            int count = 0;
            int low = 0;
            for(int i = 1;i<nums.length;i++){
                if(nums[i] == nums[low]){
                    count++;
                    if(count<2){
                        low++;
                        nums[low] = nums[i];
                    }
                }
                else{
                    low++;
                    nums[low] = nums[i];
                    count = 0;
                }
            }
            return low+1;
        }

    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int n = removeDuplicates(nums);
        for(int i = 0;i<n;i++)
            System.out.print(nums[i]);
    }
}
