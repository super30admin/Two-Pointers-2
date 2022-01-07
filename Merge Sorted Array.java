// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // intialize pointers
        int i = m - 1;      // nums1
        int j = n - 1;      // nums2
        int k = m + n - 1;  // nums1
        
        // traverse reverse through both arrays
        // insert the maximum element bewteen both arrays at the last position of the 1st array
        while(i >= 0 && j >= 0){
                // compare elements
            if(nums1[i] < nums2[j]){
                // insert maximum
                nums1[k] = nums2[j];
                
                // decrease the pointer
                j--;
                k--;
            }   
            else{
                // insert maximum
                nums1[k] = nums1[i];
                
                // decrease the pointer
                i--;
                k--;
            }     
        }

         // copy the remaining elements from 2nd array to 1st array
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}

// // Time Complexity : O(m+n)
// // Space Complexity : O(m)
// // Did this code successfully run on Leetcode : Yes

// // Your code here along with comments explaining your approach

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
        
//         // create a array with 'm' length
//         int[] nums1Copy = new int[m];
        
//         // copy all the elements of nums1 to numsCopy array
//         for(int i = 0; i < m; i++){
//             nums1Copy[i] = nums1[i];
//         }
        
//         // initialize the pointers from 0
//         int p1 = 0;
//         int p2 = 0;
        
//         // traverse until all the elements in original nums1 are passed
//         for(int i = 0; i < m + n; i++){

//             // check if element at p1 in nums1Copy is less than element at nums2
//             if(p2>=n || (p1 < m && nums1Copy[p1] <  nums2[p2])){
//                 // assign the value of nums1Copy's element to nums1 and inrease the p1 pointer
//                 nums1[i] = nums1Copy[p1];
//                 p1++;
//             } else{
//                 // assign the value of nums2's element to nums1 and increase the p2 pointer
//                 nums1[i] = nums2[p2];
//                 p2++;
//             }
//         }
//     }
// }