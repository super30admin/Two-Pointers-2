Time Complexity-O(m+n)
Space Complexity-O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 )
            return false;
        int m=matrix.length;
        int n=matrix[0].length;
        int p1=m-1;
        int p2=0;
        while(p1>=0 && p2<n)
        {
            if(matrix[p1][p2]==target)
                return true;
            if(matrix[p1][p2]>target)
                p1--;
            if(p1>=0 && matrix[p1][p2]<target)
                p2++;
            
        }
        return false;
    }
}
