package prog_80_RemoveDuplicatesSortedArray;

public class Solution {
    /*
    In this problem we have given an sorted array and we have to update an array which as each element max twice.
    In this solution we are having 2 pointers, slow and fast. Fast pointer is navigating through all elements.
    Responsibility of slow pointer is to collect an unique elements only twice
    and put the next element in the array into the slow pointer position.
    1) We will check if my fast pointer is same as fast - 1, if yes then increase the counter
       If number is different or new number, then reset the counter
    2) We will check if my counter is less than 2 then increase slow pointer and copy value of fast to the slow
       pointer.
    Time Complexity : O(N)
    Space Complexity: O(1)

     */
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int max = 2 ;
        int slow = 0 ;
        int total = 1;
        for(int fast=1; fast<=nums.length-1; fast++){
            if(nums[fast] == nums[fast-1]){
                count ++ ;
            }
            else{
                count =1 ;
            }
            if(count <= max){
                slow ++ ;
                total++ ;
                nums[slow] = nums[fast];
            }
        }
        return total ;
    }
}