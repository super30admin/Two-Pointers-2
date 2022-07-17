//240. Search a 2D Matrix II
//Time Complexity :size of first array is m and size of second array is n. So, O(m+n)
//Space Complexity : O(1) i.e. as no extra space is required to store array elements while processing 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach

/*Step 1: Take m and n as row's and column's length. And assign accordingly values to rows and columns. There are 2 best positions to start comparison with i.e bottom left 
 * and top right. For bottom left(r=m-1 and c=0) and for top right(r=0, c=n-1). These are are suitable to start with because these positions are acting as mid in sorted array.
 * Step 2: Keep comparing with target and if found equal return true and if not then check whether the target is smaller or larger. As the 2d Matrix's cols and rows are 
 * sorted. If target is smaller then move up towards small number and if target is greater then mid, then move right towards greater number. If element not found then return false
 */
//output: true

public class search2DArray {

	public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || target == 0 || matrix.length == 0) return false;
        
        int m= matrix.length;
        int n=matrix[0].length;
        
        int c=0;
        int r=m-1;
        
        // down left corner
        while(r>=0 && c<n)
        {
            if(matrix[r][c] < target)
            {
                //then move right towards greater number as it's sorted
                c++;
            }
            else if(matrix[r][c] > target){
                //then move up towards small number as it's sorted
                r--;
            }
            else{
                return true;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		int[][] matrix= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24}};
		int target=5;
		
		boolean result= searchMatrix(matrix,target);
		if(result ==  true)
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		

	}

}
