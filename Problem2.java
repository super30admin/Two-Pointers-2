// Time Complexity :O(M+N) where M is length of nums1 and N is length of nums2
// Space Complexity :O(M)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null||nums2==null||nums1.length==0||nums2.length==0) return;
        int nums1dummy[]=new int[nums1.length];
        nums1dummy = Arrays.copyOf(nums1, nums1.length);
        int i=0,j=0,k=0;
        while(i<m&&j<n){
            if(nums1dummy[i]<=nums2[j]){
                nums1[k]=nums1dummy[i];
                i++;
            }
            else{
                nums1[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            nums1[k]=nums1dummy[i];
            i++;
            k++;
        }while(j<n){
            nums1[k]=nums2[j];
            j++;
            k++;
        }
    }
}