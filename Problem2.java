
// Time Complexity : o(m+n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// logic is to start from the end of 2 arrays and compare each element and place the larger one at end and decrement ptrs.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //ptr1 starting at end of first list 1,2,3,0,0,0 starting from 3
        int ptr1 = m-1;
        //ptr2 starting from end of second list
        int ptr2 = n-1;
        //last element in nums1 where we need to place the elements
        int i = m+n-1;
        while(ptr1>=0 && ptr2>=0){
            //if nums1 has bigger element then place it at last
            if(nums1[ptr1]>nums2[ptr2]){
                nums1[i]=nums1[ptr1];
                ptr1--;
                i--;
            }
            else{
                //place nums2 element at last
                nums1[i]=nums2[ptr2];
                ptr2--;
                i--;
            }
        }
        //if still nums2 has elements and nums1 has finished then we can directly place them
        while(ptr2>=0){
            nums1[i]=nums2[ptr2];
            ptr2--;
            i--;
        }
    }
}
