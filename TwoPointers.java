public class TwoPointers {
// Time Complexity : N
// Space Complexity : 1
// Did this code successfully run on Leetcode : yes
// 3 lines explanation of code : to remove duplicates I have used 2 pointers i and j and a counter to maintain the count of duplicates
// hence until the counter reaches 2 both the pointers move together and when the counter is greater than 2
// fast pointer moves ahead until a new unique element is found and that is pasted at the slow pointer
// this loop continues until fast pointer reaches the end of array and it return index of slow pointer 
//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
//80. Remove Duplicates from Sorted Array II
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return nums[0];
        
        int j = 0;
        int count =0;
       for(int i=0;i<nums.length;i++){
        if(i>0 && nums[i]==nums[i-1]){
            count++;
        }else{
            count = 1;
        }
        if(count <=2){
            nums[j]=nums[i];
            j++;
        }
       }
        return j;
    }

// Time Complexity : N+M
// Space Complexity : 1
// Did this code successfully run on Leetcode : yes
//https://leetcode.com/problems/merge-sorted-array/
// 88. Merge Sorted Array
// 3 line explanation : I have started comparing the elements from index m-1 and n-1 and moved the larger element at
// the last index of the bigger array and accordingly merging the two array
public void merge(int[] nums1, int m, int[] nums2, int n) {
    int pt1 = m-1;
    int pt2 = n-1;
    int i = m+n-1;
        while(pt1>=0 && pt2>=0){
            if(nums1[pt1]<nums2[pt2]){
                nums1[i]=nums2[pt2]; 
                pt2--;

            }else{
                nums1[i]=nums1[pt1];                
                pt1--;               
            }
            i--;
        }
        while(pt2 >=0){
            nums1[i]=nums2[pt2];
            i--;
            pt2--;
        }
}

// Time Complexity : M+N
// Space Complexity : 1
// Did this code successfully run on Leetcode : yes
// 3 line explanation of code : traversing the matrix from the last element of first row and moving towards the target
//https://leetcode.com/problems/search-a-2d-matrix-ii/submissions/
//240. Search a 2D Matrix II
public boolean searchMatrix(int[][] matrix, int target) {
    int m = 0;
    int n = matrix[0].length-1;
    while(m<matrix.length && n>=0){
        if(matrix[m][n]== target){
            return true;
        }else if(matrix[m][n]<target){
            m++;
        }else{
            n--;
        }
    }
    return false;       
}

}
