// Time complexity: o(n)
// Space complexity: 0
// Leetcode: all test cases passed.

// EXPLANATION:
// Have a counter J to assign values, Have a total count value (to find the result) and inner counter to have a check if it crosses 2.
// case 1: if the counter is less than 2 but the next value is equal to current,increment the inner counter and j counter.
// case 2: if the next value is not equal to current, 
//             assign the value to nums[j], add innercount to total count and finally reset the inner counter.

public class problem1 {

    public static int removeDuplicatedFromSortedArray(int[] nums) {
        int innerCount = 1; int finalCount = 0; int j=0;
        if(nums.length == 0) return 0;
        if(nums.length==1) return 1;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i] == nums[i+1] && innerCount<2) {
                nums[j] = nums[i];
                innerCount++;
                j++;
            }
            else if(nums[i]==nums[i+1] && innerCount>=2) {
                // i++;
            }
            else {
                nums[j] = nums[i];
                j++;
                finalCount = finalCount+innerCount;
                innerCount = 1;
            }
            if(i==nums.length-2) {
                if(innerCount<2) {
                    nums[j] = nums[nums.length-1];
                    finalCount = finalCount+1;
                }
                else if(innerCount>2){
                    finalCount = finalCount+2;
                }
                else {
                    finalCount = finalCount+2;
                    nums[j] = nums[nums.length-1];
                }
        }
        }
             System.out.println("last condition"+innerCount);
        for(int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
        }
        return finalCount;

    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,2,3,3};
        int output = removeDuplicatedFromSortedArray(arr);
        System.out.println(output);
    }
}