// Time Complexity :O(m+n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
//USED 3 POINTER -compared with p1 with p2 and added the max in p3 continue to do 
//till the end of array handled the case or index out of bound for if p1 is out for bound but p2 still is not completed
//so added the elements of p2 to p3 directly
// Your code here along with comments explaining your approach


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2==null||nums2.length==0){
            return ;
        }
        int p1=m-1;
        int p2=n-1;
        int p3=m+n-1;
        while(p1>=0 && p2>=0){
            nums1[p3]=Math.max(nums1[p1],nums2[p2]);
            if(nums1[p1]>nums2[p2]){
                p1--;
            }
            else{
                p2--;
            }
            p3--;
        }
        while(p2>=0){
            nums1[p3]=nums2[p2];
            p2--;
            p3--;
        }

        
    }
}