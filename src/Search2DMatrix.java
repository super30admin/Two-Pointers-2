public class Search2DMatrix {

// Time Complexity :O(MN)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//start travese from left most element and traverse up or right till element is not found
// Your code here along with comments explaining your approach

    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {

            int m=matrix.length-1;
            int flag=matrix[0].length-1;
            int n=0;
            while(m>=0 && n<=flag)
            {
                if(matrix[m][n]>target)
                {
                    m--;
                }
                else if(matrix[m][n]<target)
                {
                    n++;
                }
                else{
                    return true;
                }
            }

            return false;


        }
    }
}
