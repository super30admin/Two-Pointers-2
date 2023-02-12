public class Search2dMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n-1;
        while(i<m && j>=0){
            if(target<matrix[i][j]){
                j--;
            }
            else if(target>matrix[i][j]){
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Search2dMatrix.searchMatrix(new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}},5));
    }
}
