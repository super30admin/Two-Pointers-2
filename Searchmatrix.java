Time : O(m+n);
Space : O(1);

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row=0;
        int col=matrix[0].length-1;
        int val;
        while(row<=matrix.length-1 && col>-1){
            val=matrix[row][col];
            System.out.println("value = "+val);

            if(val>target){
                col=col-1;
            }else if(val<target){
                row=row+1;
            }else{
                return true;
            }

        }
        return false;


    }
}