public class SearchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix==null||matrix.length==0)
            return false;
        int row=0,column=matrix[0].length-1;
       
        while(row<matrix.length && column>=0)
        {
            int start=matrix[row][column];
            if(target==start)
                return true;
            else if(target>start)
                row++;
            else{
                column--;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[][] matrix= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=5;
        System.out.println(searchMatrix(matrix,target));

    }
}
