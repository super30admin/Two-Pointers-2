// Time Complexity :O(nlogn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english
    //Binary search across all rows.
    //

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0;
        int c = matrix[0].length-1;
     for(int i=0;i<matrix.length;i++)
     {
         int low= 0;
         int high= c;
         if(target>=matrix[i][low] && target<=matrix[i][high])
         {
             while(low<=high)
             {
                 int mid=(low+high)/2;
                 if(matrix[i][mid]==target)
                     return true;
                 else if(matrix[i][mid]>target)
                     high=mid-1;
                 else
                     low=mid+1;
             }
         }
     }
        return false;
    }
}