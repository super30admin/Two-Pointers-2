//time complexity-o(logn)
//space complexity-o(1)
public class SearchMatrix {
	 public static boolean searchMatrix(int[][] matrix, int target) {
	      if(matrix==null || matrix.length==0)
	    	  return false;
	      int m=matrix.length;
	      System.out.print("m"+m);
	      int n=matrix[0].length;
	      int low=0;int high=m*n-1;
	      while(low<=high) {
	    	  int mid=low+(high-low)/2;
	    	  int col=mid%matrix.length;
	    	  int row=mid/matrix.length;
	    	  if(matrix[row][col]==target)
	    		  return true;
	    	  else if(matrix[row][col]>target)
	    		  high=mid-1;
	    	  else
	    		  low=mid+1;
	      }
	      return false;
	    }
	 public static void main(String args[])
	 {
		 int[][] arr = {{1, 3,5,7}, {10,11,16,20},{23,30,34,50}};
		 System.out.print("print"+searchMatrix(arr,23));
	 }
}
