/*
TC: O(N) as we are iterating 2 arrays;
SC: O(1) as we are placing elements in same array.
 */
class MergeSorted{

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m-1;
        int p2 = n-1;
        int p = nums1.length-1;

        while(p1 >= 0 || p2 >= 0){
            int x = p1>= 0 ? nums1[p1] : Integer.MIN_VALUE;
            int y = p2>= 0 ? nums2[p2] : Integer.MIN_VALUE;

            if (x > y){
                nums1[p] = x;
                p1--;
            }
            else if (y > x){
                nums1[p] = y;
                p2--;
            }
            else{
                nums1[p] = x;
                p1--;
            }
            p--;
        }
    }
}