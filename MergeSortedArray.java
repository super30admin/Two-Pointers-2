// TC - O(m+n), SC - O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Ptr1 and ptr2 to last index in arrays, but for nums1 array. ptr1 would point to index with valid value
        int ptr1 = m-1;
        int ptr2 = n-1;
        // i to m+n-1
        int i = m + n - 1;
        // Iterate while ptr1 and ptr2 are greater than 0, compare nums1 value at ptr1 idx and nums2 value at ptr2 index, if less then nums1 at ith index would be nums2 value at ptr2 index and decrement ptr2 by1, else the value at ith index for nums1 would be ptr1 value and decrement ptr1 by 1, decrement i by 1 in both cases as at the back is gettting filled either by nums1 or nums2 value 
        while(ptr1 >= 0 && ptr2 >= 0){
            if(nums1[ptr1] < nums2[ptr2]){
                nums1[i] = nums2[ptr2];
                ptr2--;
            }else{
                nums1[i] = nums1[ptr1];
                ptr1--;
            }
            i--;
        }
        
        // If ptr2 is till not 0, add values of nums2 into nums1 array till ptr2 is less than 0
        while(ptr2 >= 0){
            nums1[i] = nums2[ptr2];
            ptr2--;
            i--;
        }
    }
}

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
        
//         int i=nums1.length-1;
//         while(i>=0){
//             if(n<=0){
//                 break;
//             }
//             if(m>0 && nums1[m-1] >= nums2[n-1]){
//                 nums1[i] = nums1[m-1];
//                 m--;
//                 i--;
//             }else{
//                 nums1[i] = nums2[n-1];
//                 n--;
//                 i--;
//             }
//         }
//     }
// }


// BruteForce approach

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int j=0;
//         for(int i=m; i<nums1.length; i++){
//             nums1[i] = nums2[j];
//             j++;
//         }
//         Arrays.sort(nums1);
//     }
// }