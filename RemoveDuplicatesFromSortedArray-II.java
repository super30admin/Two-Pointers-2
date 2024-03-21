// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Take a read and a write pointer. Increment both pointers as long as the numbers are repeating
// and count<=2. When count becomes 3, write pointer holds the index position to replace the new value

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int s = 0;
        int c = 0;
        int k=2;

        for(int i=0; i<nums.length;){
            if(i==0 || nums[i]==nums[i-1]){
                c++;
            }
            else{
                c = 1;
            }

            if(c<=k){
                nums[s] = nums[i];
                s++; i++;
            }
            else{
                i++;
            }
        }
        return s;
    }
}