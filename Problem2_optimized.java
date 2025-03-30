/*
Steps:
 1. Set pointers at the end of nums1(m-1), nums2(n-1), and the write index (m+n-1).
 2. While the write index is valid:
  -Compare nums1[r1] and nums2[r2].
  -Place the larger one at nums1[w].
  -Move the respective poiunter backwards.
3. If nums2 has leftover values (and nums1 is exhausted ), copy them.

Time: O(m+n)
Space: O(1) done in-place, no extra memory used.
 


*/


public class Problem2_optimized {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int r1=m-1;//Pointer to the last initialized element in nums1
        int r2=n-1;//Pointer to the last element in nums2
        int w=m+n-1;//Pointer to the last position in nums1(write location)

        //Iterate through the back of the array to the front
        while(w>=0){
            if(r1>=0 && r2>=0){
                //Compare and write the larger element from nums1 or nums2
                if(nums1[r1]>nums2[r2]){
                    nums1[w--] = nums1[r1--];//Write nums1[r1] and move r1 and w backward
                } else{
                    nums1[w--] = nums2[r2--];//Write nums2[r2] and move r2 and w backwards
                } 
            }else if(r1>=0){
                //Only nums1 has elements left (already in place, but included for //completeness)
                nums1[w--] = nums1[r1--];

                }
                else{
                    //Only nums2 has elements left -copy remaining values
                    nums1[w--] = nums2[r2--];
                }
            }
        }
    }

