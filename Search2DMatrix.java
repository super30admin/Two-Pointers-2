public class Search2DMatrix {
        public boolean searchMatrix(int[][] matrix, int target) {
            int row = 0;
            int col = matrix[0].length-1;
            while(col>=0 && row< matrix.length){
                if(matrix[row][col] < target)
                    row++;
                else if(matrix[row][col] >target)
                    col--;
                else
                    return true;
            }
            return false;
        }
    public static void main(String[]args){
            Search2DMatrix s = new Search2DMatrix();
            int [][]matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22}};
            System.out.print(s.searchMatrix(matrix,5));
    }
}
