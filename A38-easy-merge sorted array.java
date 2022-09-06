// TC= O(m+n)
// SC= O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p2= n-1;
        int p3= m+n-1;
        int p1= m-1;

        while(p1>=0 && p2>=0){
            if(nums1[p1] <= nums2[p2]){
                nums1[p3] = nums2[p2];
                 p2--;
            }else{
                nums1[p3] = nums1[p1];
                 p1--;
            }p3--;
        }

        while(p2>=0){           //if second array is left with some elements
            nums1[p3]= nums2[p2];
            p2--;p3--;
        }

    }
}