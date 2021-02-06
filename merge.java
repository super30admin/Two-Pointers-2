// Time Complexity : O(m+n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //use three pointers one from end of array1 ,second from end of array2 and third from end of elements of array1
        int i = nums1.length-1;
        m--; n--;
        
        while(m>=0&&n>=0) {
            
            //if nums1>num2 set nums1[from-end] to nums1 ekse nums2
            if(nums1[m] > nums2[n]) {
                nums1[i--] = nums1[m--];
            } else {
                nums1[i--] = nums2[n--];
            }            
        }
        while(n>=0) {
            nums1[i--] = nums2[n--];
        }
        
    }
}
