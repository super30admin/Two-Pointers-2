public class Search2DMatrix2 {
        public boolean searchMatrix(int[][] mat, int target) {
            int n = mat.length;
            int m = mat[0].length;

            int i=0, j= m-1;
            while(i < n &&  j >= 0){
                if(target == mat[i][j]){
                    return true;
                }else if(target < mat[i][j]){
                    if(searchRow(mat, i, j, target)){
                        return true;
                    }
                }else{
                    if(searchCol(mat, i, j, target)){
                        return true;
                    }
                }
                i++;
                j--;
            }
            return false;
        }

        public boolean searchRow(int[][] mat, int i, int j, int target){
            int low = 0, high =j;
            while(low <= high){
                int mid = low + (high-low)/2;
                if(target == mat[i][mid]){
                    return true;
                }else if(target < mat[i][mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            return false;
        }

        public boolean searchCol(int[][] mat, int i, int j, int target){
            int low = 0, high =mat.length-1;

            while(low <= high){
                int mid = low + (high-low)/2;
                if(target == mat[mid][j]){
                    return true;
                }else if(target < mat[mid][j]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            return false;
        }
}
