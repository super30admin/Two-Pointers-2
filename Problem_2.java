
// Time Complexity :O(n) n is the length of nums1;
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//using two pointers: one pointer on n-1 and one on m-1 and comparing both values and assigning the bigger one to the end of nums1
// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=nums1.length-1;
        int p1=m-1,p2=n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1]<nums2[p2]){
                nums1[len]=nums2[p2];
                p2--;
                len--;
            }else{
                nums1[len]=nums1[p1];
                p1--;
                len--;
            }
        }
        while(p2>=0){
            nums1[len]=nums2[p2];
            len--;
            p2--;
        }
    }
}