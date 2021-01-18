// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


public class problem1 {
    public int removeDuplicates(int[] nums) {

        // edge case
        if(nums.length == 0 || nums == null) return 0;

        int j=1; int count =1;

        // start with second element and compare with first one
    for(int i=1;i<nums.length;i++){

        // if equal increment count
        if(nums[i]==nums[i-1]){
            count++;

        }else{
            // else set counter back to 1
            count=1;
        }

        // if counter is less than/ equal to 2, set element at j with element at i and increment j
    // K here in this problem is 2, it can be 3 / 4 /5....
        if(count<=2){
                nums[j]=nums[i];
                j++;
            }

    }

        return j;

    }
} 