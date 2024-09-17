
// Time Complexity :o(m+n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
   
    public boolean searchMatrix(int[][] matrix, int target) {
      int top=matrix.length-1, right=0;
        
        while(top >= 0 && right<= matrix[0].length-1){
            System.out.println("top:"+top+"  right:"+right);
            if(matrix[top][right]==target){
               return true;
            }
            else if(matrix[top][right]>target){
                top --;
            }
            else{ right++;
                 System.out.println("system check  right:"+right);
                }
        }
    return false;
    }
        
}



//solution 2
//  public int getcolumn(int[][] arr,int target){
//          int index=0;
//         for(int k=0;k<arr[0].length;k++){
//     if(arr[0][k]>=target){
//        index=k;
//         return index;
//     }
//     }
//         index= arr[0].length-1;
//         System.out.println("index"+ index);
//         return index;
//     }
//     public boolean searchMatrix(int[][] matrix, int target) {
       
//        if(matrix.length <1 || matrix[0].length <1){
//            System.out.println("empty");
//            return false;
//        }   

//     int indexk= getcolumn(matrix,target);
//   for(int i=0;i<matrix.length;i++){
//          for(int j=0;j<=indexk;j++){
//              if(matrix[i][j]==target){
//                  return true;
//              }
             
//          }
//      }   
//         return false;
//     }

//solution 3

//     public boolean searchMatrix(int[][] matrix, int target) {
//      for(int i=0;i<matrix.length;i++){
//          for(int j=0;j<matrix[0].length;j++){
//              if(matrix[i][j]==target){
//                  return true;
//              }
             
//          }
//      }   
//         return false;
//     }