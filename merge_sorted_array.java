
// Time Complexity : O(m+n), where m+n is the size of the nums1 (the bigger) array
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
//1. we take 2 pointers, at m-1 and n-1, as the both arrays are already sorted individually before merging
//2. we take one more pointer at (m+n -1) int the first (bigger array), so as we start placing the numbers in the descending order from behind
//3. At every iteration, just check if which element out of the 2 (nums1[1] OR nums2[j]) is bigger and place it at the third index. 
    //keep doing this till the 2 pointers are not out of bounds. In the end just check if some elements are left to be iterated in 
    // in the 2 nd (smaller array), if yes then place all the remaing elements of 2 nd array in 1 st(bigger) array at the third index's position

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //return , if nums1 is null or empty
        if(nums1 ==null || nums1.length ==0) return;
        
        //take 3 pointers
        int ptr1 = m-1;
        int ptr2= n-1;
        int  place = nums1.length -1;
        
        
        while(ptr1 >= 0  && ptr2 >=0){
            //place the greater element of nums1 and nums2 at "place" position in nums1
            if( nums1[ptr1] < nums2[ptr2]){
                nums1[place] = nums2[ptr2];
                ptr2--;
            }
            else{
                nums1[place] = nums1[ptr1];
                ptr1--;
            }
            place--;
        }
        
        //if pointer at nums2 is still not less than 0, then place remaining elements of nums2 at "place" position in nums1
        while(ptr2 >=0){
            nums1[place] = nums2[ptr2];
            ptr2--;
            place--;
        }
    }
}