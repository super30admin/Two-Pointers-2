
// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/** since array is sorted and zeros are at the end, best way is to take 2 pointers from the end of both arrays
    compare elements from end of both arrays, bigger number will be filled in the last index
   if all elements from nums1 are filled in the zeros, iterate through nums2 and fill all the remaining
 elements of nums2 in the nums1
 */
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1= m-1;
        int p2= n-1;
        int i= m+n -1;

        while(p1 >= 0 && p2 >= 0) {
            if(nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1];
                p1--;
            }else{
                nums1[i]= nums2[p2];
                p2--;
            }
            i--;
        }

        while(p2 >= 0){
            nums1[i] = nums2[p2];
            i--;
            p2--;
        }
    }
}