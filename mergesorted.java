// Time Complexity : o(m*n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no




// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m+n-1;
        int p1=m-1;
        int p2=n-1;    
        while(p2>=0 && p1>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[i]=nums1[p1];
                i--;
                p1--;
            }else{
                nums1[i]=nums2[p2];
                i--;
                p2--;
            }
        }
        while(p2>=0){
            nums1[i]=nums2[p2];
            i--;
            p2--;
        }
    }
}