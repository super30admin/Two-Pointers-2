
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

My bruteforce approach:
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length-1;
        int n= matrix[0].length-1;
        System.out.println(m);
        System.out.println(n);
        int l=0;
        int r=0;
        for(int i=0;i<m*n;i++)
        {
         l=0;
          r=n;
            while(l!=r)
            { 
               int mid=l+(r-l)/2;
                System.out.println(mid);
                if(target==matrix[i][mid])
                    return true;
                else if(target<matrix[i][mid])
                {
                    r=mid-1;
                }
                else
                {
                l=mid+1;
                }
               System.out.println("iteration done");     
            }
        }
        return false;
    }
}

