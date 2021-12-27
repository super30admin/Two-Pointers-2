
// Time Complexity :O(M+N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english
//Take 3 pointers , start from end from both arrays.
//loop through the array checking last digit of both arrays. Comapre them and store the larger one in the end of the first array
//continue looping till ptr 1 and ptr 2 are valid (>=0)


// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0){
            return;
        }

        int ptr1 = m - 1;
        int ptr2 = n - 1;
        int index =m + n - 1;

        while(ptr1 >= 0 && ptr2 >=0){
            for(int i=0;i<nums2.length;i++){
                if(nums1[ptr1] < nums2[ptr2]){
                    nums1[index] = nums2[ptr2];
                    ptr2--;
                }
                else{
                    nums1[index] = nums1[ptr1];
                    ptr1--;

                }
                index--;

            }
        }
    }
}