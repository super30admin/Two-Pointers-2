//Time COMPLEXITY: O(M+N)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null||nums1.length==0){
            return;
        }
       
        //use three pointers
        int p1=m-1, p2=n-1, p3 = m+n-1;
        //iterate through two arrays
        while(p1>=0 && p2 >= 0){
            if(nums1[p1]>=nums2[p2]){
                    nums1[p3] = nums1[p1];
                   
                    p1--;   
            }
            else{
                if(nums1[p1] < nums2[p2]){
                nums1[p3] = nums2[p2];
                p2--;
                
            }
            }
            p3--;
        }
        //if p1 is out of bound and p2 has some elements to be looked into
        //this aslo takes care of the case when there are 0 elements in nums1 and elements present in nums2
        while(p2>=0){
            nums1[p3] = nums2[p2];
            p3--;
            p2--;
        }