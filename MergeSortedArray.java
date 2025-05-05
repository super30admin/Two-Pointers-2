//Time: O(m+n)
//Space: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int ptr1=m-1, ptr2=n-1, curr=m+n-1;

        while(ptr2>=0 && ptr1>=0){

            if(nums1[ptr1]>=nums2[ptr2]){
                nums1[curr]=nums1[ptr1];
                ptr1--;
            }
            else{
                nums1[curr]=nums2[ptr2];
                ptr2--;
            }
            curr--;
        }
        while(ptr2>=0){
            nums1[curr--]=nums2[ptr2--];
        }

    }
}