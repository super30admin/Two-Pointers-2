
//time Complexity O(n+m) and Space Complexity
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length-1;
        int col = 0;

        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]>target){
                row--;
            }else if(matrix[row][col]<target){
                col++;
            }else{
                return true;
            }
        }
        return false;
    }
}


//merge sorted array
//Time Complexity O(N) ans space complexity O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        int i=m-1;
        int j=nums1.length-1;
        int k=n-1;

        while(k>=0 && i>=0){

            if(nums1[i]>nums2[k]){
                nums1[j]=nums1[i];
                i--;
            }else{
                nums1[j]=nums2[k];
                k--;
            }
            j--;
        }

        while(k>=0){
            nums1[j]=nums2[k];
            k--;
            j--;
        }
        
    }
}

//remove duplicates from sorted array 2

//Time complexity O(N)and space Complexity O(1)
class Solution {
    public int removeDuplicates(int[] nums) {

        int count=0;
        int s=0;

        for(int i=0;i<nums.length;i++){

            if(i==0 || nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }

            if(count<=2){
                nums[s]=nums[i];
                s++;
            }
        }

        return s;
        
    }
}
