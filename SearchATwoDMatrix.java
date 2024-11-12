// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes

public class SearchATwoDMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n= matrix[0].length;
        int r=m-1;
        int c=0;


        while(r>=0 && c<n){
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]>target){
                r--;
            }else{
                c++;
            }
        }
        return false;
    }

    public static void main(String args[]) {
            SearchATwoDMatrix search = new SearchATwoDMatrix();
        int[][] nums={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println("Output "+search.searchMatrix(nums, 16));

    }
}
