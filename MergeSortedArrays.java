/* Time complexity: O(m+n) total number of elements
 * Space Complexity: O(1) in place
 * leetcode: yes
 * Any Issues: no
 */
class MergeSortedArrays
{
    //used three pointers one at the end of the first array to maintain the placeholder pointer
    //and other two at the end of the elements in the first and second arrays.
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int p3 = nums1.length-1;

        while(p1>=0 && p2>=0)
        {
            if(nums1[p1] >= nums2[p2])
                nums1[p3--] = nums1[p1--];
            else
                nums1[p3--] = nums2[p2--];
        }
        while(p2>=0)
            nums1[p3--] = nums2[p2--];
    }    
    
}