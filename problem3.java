class search2DMatrix{
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int i = m - 1;
        int j = 0;

        while(i >= 0 && j < n){
            if(matrix[i][j] == target){
                return true;
            }
            else if(target > matrix[i][j]){
                j++;
            }
            else{
                i--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        search2DMatrix sm = new search2DMatrix();
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        System.out.println(sm.searchMatrix(matrix, target));
    }
}