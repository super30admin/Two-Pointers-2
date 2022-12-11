
// Time Complexity : O(m +n) ,, O(M) for going over nums1 , then if elements remaining we will go over O(n) items
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
We know that both array are sorted, which means the ordering of elements in those arrays is sorted
on the nums array the indices after m-1 are there for storing the large elements

we will start from the end of the arrays , and push bigger elements at the end
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int ptr1 = m-1;
        int ptr2 = n-1;
        int high = nums1.length-1;

        //if any pointer goes out of bounds then we are done

        while(ptr1>=0 && ptr2 >=0){

            // if ptr 1 value is bigger or equal to ptr2 value, then ptr1 value goes to high, high decrements, ptr2 value goes to ptr1 location and ptr1 decrements

            if(nums1[ptr1] >= nums2[ptr2]){

                nums1[high--] = nums1[ptr1]; // when swapping with high, high decrements
                nums1[ptr1] = nums2[ptr2];
                ptr1--;// the higher value pointer decrements
            }

            // else, ptr2 value to go high , high decrements, ptr2 decrements
            else{
                nums1[high--] = nums2[ptr2]; // when swapping with high, high decrements
                ptr2--; // the higher value pointer decrements
            }
        }    


        //if there are elements left in nums2, then they would be just copied to nums1 from right to left
            if(ptr2>-1){
                while(ptr2>-1){
                    nums1[high--] = nums2[ptr2--];
                }
            }

    }
}