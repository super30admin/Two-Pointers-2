/*

Thought Process: Understanding to solve it using two pointers is important. Marking the pointers is also very important. Since we are given sorted arrays, and the first array has zeroes to fill in, so lets start with the pointers at the end of both array i.e. m-1 & n-1. Then compare the values, whichever is greater put it at end (m+n-1)

TC -> O(M+N) - As we are passing thorough both the arrays together in a single pass
SC -> O(1) - Two pointer approach

Mistakes Commited -> Took some time to understand the right approach. Once figured on WB, commited mistake in line no 23. Did previously if(p1<0) continue;

*/

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        
        for(int i=m+n-1; i>=0; i--){
            if(p2 >= 0 && p1<0){
                nums1[i] = nums2[p2];
                p2--;
                continue;
            }
            if(p2<0)
                continue;
            if(nums2[p2] > nums1[p1]){
                nums1[i] = nums2[p2];
                p2--;
            }else{
                nums1[i] = nums1[p1];
                p1--;
            }
        }
    }
}