class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int i=0;
        int j=a[0].length-1;
        while(i<a.length && j>=0){
            if(a[i][j]==target){
                return true;
            }
            else if(target<a[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}