 // Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Ye




// class Solution {
//TC : m(logn)
//     public boolean searchMatrix(int[][] matrix, int target) {
//         boolean res=false;
//         for(int i=0; i<matrix.length;i++){ 
//             res = helper(matrix[i], target);
//             if(res==true){
//                 return res;
//             }
//         }  
//         return res;
//     }

//     private boolean helper(int[] matrix, int target){
//         int left =0;
//         int right = matrix.length-1;
        
//         while(left<=right){
//               int mid = (right+left)/2;
            
//               System.out.print(matrix[mid]);
//             if(matrix[mid]==target){
                
//                 return true;
//             }
//            else if(matrix[mid]>target){
//                 right=mid-1;
//             }
//             else{
//                 left=mid+1;
//             }
//         }
//         return false;
//     }
// }
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0; int j = n-1;
        while(i<=m-1 && j>=0){
            
            if(matrix[i][j]==target){
                return true;
            }
            
            
            if(matrix[i][j]> target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
