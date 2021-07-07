/**
LeetCode Submitted : YES
Time Complexity : O(N)
Space Complexity : O(1)
I initally missed the trick and do it the other way around putting smaller values at the start of the array which required additional condition logic.
The trick is to put values of array 1 less than values of array 2 at the end of the array. Similar observation need to be done if array 2 less than array 1 **/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int first  =  m -1;
        int second =  n-1;
        int index  =  m + n - 1;
        
        while(first >= 0 && second >= 0){
            if(nums1[first] > nums2[second]){
                nums1[index] = nums1[first];
                first = first - 1;
                index = index - 1;
            }else{
                nums1[index] = nums2[second];
                second = second - 1;
                index = index - 1;
            }
        }
        
        while(second >= 0){
            nums1[index] = nums2[second];
            second = second - 1;
            index  = index - 1;
        }
        
    }
}
