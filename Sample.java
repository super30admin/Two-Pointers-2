Problem2 (https://leetcode.com/problems/merge-sorted-array/)
Brute Force: Simply add elements of second array to the first array and sort
// Time Complexity : O(m+n) + O(logn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        while(j < n){
            nums1[m]=nums2[j];
            m++;
            j++;
        }
        Arrays.sort(nums1);
    }
}

Optimal approach using 2 pointers:
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null || nums1.length==0) return; 
        int p=nums1.length-1;
        int p1=m-1;
        int p2=n-1;
        while(p1>=0 && p2>=0){
            if(nums2[p2]>nums1[p1]){
                nums1[p]=nums2[p2];
                //p--;
                p2--;
            }
            else{
                nums1[p]=nums1[p1];
                //p--;
                p1--;
            }
            p--;
        }
        while(p2>=0){
            nums1[p]=nums2[p2];
            p2--;
            p--;
        }
    }
}




Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0) return false;
        int m=matrix.length; int n=matrix[0].length;
        int i=0; int j=n-1;
        while(i<m && j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            if(matrix[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
    return false; 
    }
}