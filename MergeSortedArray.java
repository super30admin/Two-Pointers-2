
// Time Complexity : O(m+1) where 'n' is length of nums2, 'm' is length of nums1
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes


//Taken 2 pointers p1 and p2, p1 is index for the first array and p2 is the index of 
//second array, comparing the elements and placing the greater element at the last
//index of first array
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m -1;
        int p2 = n - 1;
        int p3 = m+n -1 ;
        while(p1>=0 && p2>=0){
            if(nums1[p1]>=nums2[p2]){
                nums1[p3] = nums1[p1];
                p1--;
            }else{
                nums1[p3]=nums2[p2];
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