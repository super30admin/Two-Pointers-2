
public class SearchInMatrix2 {
    
    //Start with each first row last column / last row first column. - So that we increase or decrase
    //For Example: Last row and first column - If it less than target, increase column else decrease column
    //TC:O(M+N) -> O(Max(M,N)) - Where M is the lenght of the row and N is the length of the column.
    //SC: O(1) As we are not using any extra space
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int r = m-1;
        int c = 0;
        while(r>=0 && r<m && c>=0 && c<n) {
            if(matrix[r][c]  == target) return true;
            else if(matrix[r][c] < target) {
                c++;
            } else {
                r--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SearchInMatrix2 searchInMatrix2 = new SearchInMatrix2();
        boolean result = searchInMatrix2.searchMatrix(new int[][] {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,2},
            {10,13,14,17,24},
            {18,21,23,26,30},
        }, 20);
        System.out.println("Is target found: "+result);
    }
}
