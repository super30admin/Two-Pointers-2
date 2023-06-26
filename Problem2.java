// Time Complexity : O(n+m)
// Space Complexity : O(1)
    // n+m is the length of the final array

// Your code here along with comments explaining your approach
    //We traverse from the right to left. We use 3 pointers, i, j and index. They are initialized as the sizes of nums1(excluding the zeros), nums2, and combined array.
    //When nums1[i] is greater than nums2[j], then we overwrite nums1[index] with nums1[i]. Otherwise, we overwrite it with nums2[j]. We decrement both indexes involved in overwriting. 
    //When the indexes reach zero, we might still be left with some numbers unvisited in nums2 array, we copy them in the same order.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int i=m-1, j=n-1, index = nums1.length-1;
        while(i>=0&&j>=0)
        {
            if (nums1[i]>=nums2[j])
            {
                nums1[index--] = nums1[i--];
            }
            else
            {
                nums1[index--] = nums2[j--];
            }
        }
        while(j>=0)
        {
            nums1[index--] = nums2[j--];
        }
    }
}