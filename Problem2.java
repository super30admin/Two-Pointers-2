
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Problem2 {
    //TC :O(N+M)
    //SC :O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int Idx = nums1.length-1;
        int p1 = m-1;
        int p2 = n-1;

        while(p1>=0 && p2>=0){
            if(nums2[p2]>nums1[p1]){
                nums1[Idx]= nums2[p2];
                p2--;

            }else{
                nums1[Idx]= nums1[p1];
                p1--;
            }
            Idx--;
        }

        while(p2>=0){
            nums1[Idx]= nums2[p2];
            p2--;
            Idx--;
        }

    }
}