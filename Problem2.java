class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1=m-1;
        int p2=n-1;
        int idx=m+n-1;
        while(p1>=0 && p2>=0){
            //if value at pointer1 is greater than value in 2nd array of pointer 2
            //then we put that value at 1st array at last idx
            if(nums1[p1]>=nums2[p2]){
                nums1[idx]=nums1[p1];
                p1--;
            }
            else{
            //if value at pointer2 is greater than value in 1st array of pointer 1
            //then we put that value at 1st array at last idx
                nums1[idx]=nums2[p2];
                p2--;
            }
            //move the idx pointer inwards
            idx--;
        }
        //if p2 is not out of bonds, just copy the elements from p2 to idx pointer
        while(p2>=0){
            nums1[idx]=nums2[p2];
            p2--;
            idx--;
        }
    }
}