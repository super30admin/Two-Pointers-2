//Time Complexity : O(M+N)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode :  yes

//1) Search can be started from only two positions i.e either from lastrow firstcolumn or firstrow lastcolumn because, the other two corners does not have both smaller 
//   and greater values to their adjacent places;
//2) for solution-1; checking if target less than cell value then row-- else column++; soluton-2; checking if target greater than cell value then row++ else column--;
//3) repeting process until pointer goes outofIndex or find the target at matrix[r][c];   

lass Main{
  public static void main(String []args){
    int [][]matrix={ { 1, 4, 7, 11, 15 },
                     { 2, 5, 8, 12, 19 },
                     { 3, 6, 9, 16, 22},
                     { 10, 13, 14, 17, 24 },
                     { 18, 21, 23, 26, 30} };
    int target=16;
    System.out.println("Is target present in matrix (searching from leftbottom search of matrix :" +findTargetBottom(matrix, target));
    System.out.println("Is target present in matrix (searching from topright search of matrix :" +findTargetRight(matrix, target));
  }
  //solution-1 from left most corner of matrix
  public static boolean findTargetBottom(int [][]matrix, int target){
    
    if(matrix==null || matrix.length==0){
      return false;
    }
    int m=matrix.length; 
    int n=matrix[0].length;
    int r=m-1;
    int c=0;
    while(r>=0 && c<n){
      if(matrix[r][c]==target){
        System.out.println("Found at locatio : "+r+ "-"+c);
        return true;
      }else if(target < matrix[r][c]){
        r--;
      }else{
        c++;
      }
    }
    return false;
  }

   //solution-2 from topright  corner of matrix
  public static boolean findTargetRight(int [][]matrix, int target){
    if(matrix==null || matrix.length==0){
      return false;
    }
    int m=matrix.length;
    int n=matrix[0].length;
    int r=0;
    int c=n-1;
    while(r<m && c>=0){
      if(matrix[r][c]==target){
        System.out.println("Found at locatio : "+r+ "-"+c);
        return true;
      }else if(target > matrix[r][c]){
        r++;
      }else{
        c--;
      }
    }
    return false;
  } 
}

/*
OUTPUT: 
Found at locatio : 2-3
Is target present in matrix (searching from leftbottom search of matrix :true
Found at locatio : 2-3
Is target present in matrix (searching from topright search of matrix :true
*/