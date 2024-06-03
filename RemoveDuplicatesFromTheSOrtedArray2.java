// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english
// two pointer approah.
//start with two pointer at index 1 and count 1 as we counted element at index 0
//check if element at i is equal to i-1. if true increament count
// if element is not the same reset the count to 1 as we already saw new element
//if value of count is less than 2  or equa to two swap element at i with element at j and increament the j
//when exit the for loop, return the j which is length of new de duped array
// Your code here along with comments explaining your approach

public class RemoveDuplicatesFromTheSOrtedArray2 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int j=1;
        int cnt=1;
        for(int i=1; i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                cnt++;
            }else{
                cnt =1;
            }
            if(cnt<=2){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
