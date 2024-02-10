
// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes


// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int p1 = m-1; // pointer 1 at the end of nums1
        int p2 = n-1; // pointer 2 at the end of nums2
        int p3 = m+n -1;// 3 at the end of m+n -1
        while(p1 >= 0 && p2 >= 0){ // when both the idex are not out of bound
            if(nums1[p1] < nums2[p2]){
                nums1[p3]=nums2[p2];//if p2 is greater overwrite the elements
                p2--;
            } else {
                nums1[p3]=nums1[p1];//if p1 is greater overwrite the elements
                p1--;
            }
            p3--;
            
        }
        while(p2>=0){//if any element is left in p2 then checkand overwrite
                nums1[p3] = nums2[p2];
                p2--;
                p3--;
            }
        
    }
}