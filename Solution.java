//Time Complexity: O(m+n)
//Space Complexity: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //null check
        if(m==0 && n==0){
            return;
        }
        if(n==0){
            return;
        }
        if(m==0){
            int i = 0;
            while(i<n){
                nums1[i] = nums2[i];
                i++;
            }
            return;
        }

        int p1 = m-1;
        int p2 = n-1;
        int idx = m+n-1;

        //move the pointers and sort
        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[idx] = nums1[p1];
                p1--;
            }
            else{
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }
        while(p2>=0){
            nums1[idx] = nums2[p2];
            idx--;
            p2--;
        }
    }
}
