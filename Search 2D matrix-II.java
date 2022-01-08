//Time complexity: O(m)+O(nlogn)
//Space complexity: O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==1 && matrix[0].length==1)
        {
            if(target==matrix[0][0])
                return true;
            else
                return false;
        }
        for(int i=0;i<matrix.length;i++)
        {
            if(target==matrix[i][matrix[0].length-1] || target==matrix[i][0])
                return true;
                
            if(target<matrix[i][matrix[0].length-1] && target>matrix[i][0]){
            if(binarysearch(matrix,0,matrix[0].length,target,i))
                return true;
                else
                    continue;
            }
            else
                continue;
        }
        return false;
    }
    public boolean binarysearch(int[][]matrix, int low, int high, int target,int index)
    {
        
        
        while(low<=high)
        {
            int mid= (low+high)/2;
            if(target== matrix[index][mid])
            return true;
            else if(target<matrix[index][mid])
                high=mid-1;
            else if(target>matrix[index][mid])
                low=mid+1;
        }
        return false;
    }
}
