//time complexity:O(m+n)
//space complexity:O(1)
public class MatrixSearch {
        public boolean searchMatrix(int[][] matrix, int target)
        {
            if(matrix==null || matrix.length==0)
            {
                return false;
            }
            int m= matrix.length;
            int n= matrix[0].length;
            int row=0;
            int col=n-1;
            while(row<m && col>=0)
            {
                if(matrix[row][col]== target)
                {
                    return true;
                }
                else if(matrix[row][col]> target)
                {
                    col--;
                }
                else
                {
                    row++;
                }
            }
            return false;
        }
        public static void main(String[] args)
        {
            MatrixSearch ms=new MatrixSearch();
            int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
            int target = 5;
            System.out.println(ms.searchMatrix(matrix, target));
        }
    }

