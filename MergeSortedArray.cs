//Time Complexity: O(m + n)
//Space Complexity: O(1)

//Approach

//Use three pointers (p1, p2, i) starting from the end of nums1, nums2 and the merged array.
//While p2 >= 0, place the larger of nums1[p1] and nums2[p2] at nums1[i] (guarding p1 >= 0).
//Decrement pointers accordingly; remaining nums1 elements are already in correct position.
public class Solution
{
    public void Merge(int[] nums1, int m, int[] nums2, int n)
    {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;
        while (p2 >= 0) //Because nums2 must be fully merged
        {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) //Because p1 might be exhausted, but p2 not  be ignored
            {
                nums1[i--] = nums1[p1--];
            }
            else
            {
                nums1[i--] = nums2[p2--];
            }
        }
    }
}





