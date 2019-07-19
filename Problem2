// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

//Approach: We start putting elements in the resultant array in the last index of the combined array(i.e. nums1.length->m+n-1)
//starting from first index does not work, since we aare not using extra space and we will end losing elements from nums1 while replacing 

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m-1; //last element of nums1
    int n2 = n-1;
    
    for (int i = m+n-1; i >= 0; i--) { //not num1.length -1 because size of num1 >= m+n
        
        if(n2<0) {
            //finished with nums2, rest of nums1 already there
			break;
        }
        
        else if(n1<0) {
            //finished with nums1, get rest of nums2
            nums1[i] = nums2[n2];
            n2--;
        }
        
        else if(nums2[n2]>=nums1[n1]){
            nums1[i] = nums2[n2];
            n2--;
        }
        
        else {
            nums1[i] = nums1[n1];
            n1--;
        }
    }
        
        
    }
}
