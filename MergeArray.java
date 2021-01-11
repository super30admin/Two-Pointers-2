
// Time Complexity : 0(m+n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes

class MargeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(nums1 == null || nums1.length == 0)
            return;

        //start from behind bcoz if we start from beginning, our second array could go out of sort
        int p1 = m-1, p2 = n-1;

        int idx = m+n-1;

        //work all pointers backward
        while(p1>=0 && p2>=0){
            //whichever num is greater, put it behind in main array
            if(nums1[p1] > nums2[p2]){
                nums1[idx] = nums1[p1];
                p1--;
            }else{
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }

        //if p1>0 and p2<0 we don't need any condition as main array is already sorted
        while(p2>=0){
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}