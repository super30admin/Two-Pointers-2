class Solution {
    // Two Pointer Approach
    // Time Complexity: O(m+n)
    // Space Complexity: O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2==null || nums2.length==0)
        {
            return;
        }
        // To keep track of highest elemnent in the nums1 array
        int p1=m-1;
        // To keep track of highest elemnent in the nums2 array
        int p2= n-1;
        // Last element in nums1 where the highest value is placed
        int p = m+n-1;
// Elements from nums2 added to nums1 array
while(p2>=0 && p1>=0)
{
    // Place the highest value in the end index(p) of nums1
    nums1[p] = Math.max(nums1[p1], nums2[p2]);
    // if nums1[p1] value is placed in the end then decrement p1
    if(nums1[p1]>nums2[p2])
    {
       p1--;
    }
    // if nums2[p2] value is placed in the end then decrement p2
    else {
        p2--;
    }
    // Decrement p in every iteration as the highest possible value is placed at that index.
    p--;
}

// This case means that we have traversed the nums1 until 0 but there are still elements left in nums2 to be traversed 
// Example: nums1=[4,5,6,0,0,0] and nums2=[1,2,3]
// So intermediate array before the below loop is 
// nums1=[4,5,6,4,5,6]
// To consider all values in nums2 we run below loop
// We do need to do the same step for nums1 because even if p1 is not reached to 0
// The array nums1 is already sorted.
while(p2>=0)
{
    nums1[p] = nums2[p2];
    p2--;
    p--;
}
    }

}
