
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

// class Solution {
//     //TC O(n) SC O(1)
//     public int removeDuplicates(int[] nums) {
//         if(nums == null || nums.length ==0) return 0;
//         int count = 1;
//         int pointer = 1;
//        // int pointer1 = 1;
// //         while(pointer1 == nums.length){
// //             if(nums[pointer1-1] == nums[pointer1] && count<=2){
// //                 count++;
// //                 pointer1++;
// //                 pointer++;
                
// //             } if(nums[pointer1-1] == nums[pointer1] && count>2){
// //                 count++;
// //                 pointer1++;
                
// //             }if(nums[pointer1-1] != nums[pointer1]) {
// //                 count=1;
// //                 nums[pointer] = nums[pointer1];
// //                 pointer++;
// //                 pointer1++;
// //             }
// //         }
        
//             for(int pointer1 = 1; pointer1<nums.length;pointer1++){
//                 if(nums[pointer1]==nums[pointer1-1]){
//                     count++;
                    
//                 }
//                 else {
//                     count =1;
//                 } if(count<=2){
//                     nums[pointer] = nums[pointer1];
//                     pointer++;
//                 }
    
//                 }
//    return pointer; }
// }


class Solution {
    //tc o(n+m) SC O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 ==null || nums2 == null) return;
        
        int r1 = m-1;
        int r2 = n-1;
        int r3 = m+n-1;
         
        while(r1>=0 && r2>=0){
            if(nums1[r1]>nums2[r2]){
                nums1[r3] = nums1[r1];
                r1--;
                
            }
            else{
                nums1[r3] = nums2[r2];
                r2--;
            }
            r3--;
        }
        
        while(r2>=0){
            nums1[r3] = nums2[r2];
            r2--;
            r3--;
        }
    }
}


class Solution {
    //TC O(m*n) SC O(1)
    
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length ==0) return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        int i = m-1;
        int j =0;
        while (i>=0 && j<n){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                i--;
            } else
            {
                j++;
            }
            
        }
    return false;}
}
