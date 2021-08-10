// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Yes, for inplace solution 


// Your code here along with comments explaining your approach
/* Approach
1) Start from last index where the array elements are non zero
2) point pointers i, j as mentioned in code and then iterate over it upto 0 from
3) if the element in first array is greater than element in array2 we store the bigger element at position k which will point as last element in array
4) same with the else condition
5) then we check if there are any reamining elements present in array 2. If they are present then just copy that elements in the exisiting position using a second while loop


*/



class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=m-1;// pointing to last non zero elemnt as index starts with 0,1,2 thus i will point to 2 and not 3

        int j=n-1;// pointing to last non zero elemnt as index starts with 0,1,2 thus i will point to 2 and not 3
        
        int k=m+n-1;
        
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else
            {
                nums1[k]=nums2[j];
                j--;
                k--;
                
            }
        }
        
        while(j>=0)
        {
            nums1[k]=nums2[j];
            j--;
            k--;
        }
        
    }
}