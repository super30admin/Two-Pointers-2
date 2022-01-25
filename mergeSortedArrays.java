//Time Complexity:O(m + n) -- size of the two arrays
//Space Complexity: O(1)
//We make use of three pointer to solve this problem. We start from the end of array 1 and 2 and compare the elements and put the bigger
//one of either of them to the last of the aray1. We keep doing this until we reach the end of either of the arrays. After we are done
//we use another loop to copy any remaining elements from array2 to array1



class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1; int j = n-1;
        int k = nums1.length - 1;
        
        while(i>=0 && j>=0){
            if(nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                k--;
                j--;
                
            }else{
                nums1[k] = nums1[i];
                k--;
                i--;
            }
        }
        
        while(j>=0){
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
}