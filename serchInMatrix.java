//TC O(m+n) SC O1

public class serchInMatrix {
    public static void main(String[] args) {
        int[][] m={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        searchMatrix(m,8);
    }

        public static boolean searchMatrix(int[][] matrix, int target) {
            int col=matrix[0].length;
            int row=matrix.length;
            int r=row-1;
            int c=0;
            while(r>=0 && c<col){
                if(matrix[r][c]==target)return true;
                if(matrix[r][c]<target){
                    c++;
                }
                else{
                    r--;
                }

            }

            return false;
        }
    }

