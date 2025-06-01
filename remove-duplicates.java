//T.C: O(n) n: length of nums[]
//S.c: O(1) No extra data structure is used except few variables to store my pointers which is constant.

/*Approach: Iterate though the nums[]. keep track of count. Slow ppointer will keep track of nums[] without duplicates. each time i encounter a number which appeared more than 2 than i will search for the next number and replace it. 
*/

public class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        int count = 1;
        int slow = 1;

        for(int i = 1; i < nums.length; i++){

            if(nums[i] != nums[i-1]) count = 1;
            else count++;

            if(count <= k){
                nums[slow] = nums[i];
                slow++;
            }
        }
    return slow;
    }
} {
    
}
