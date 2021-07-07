//time complexity:O(N)
//Space Complexity: O(1)
//Ran on leetcode and accepted
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        //assign pointer 1 to the last element of nums1 array
        int p1 = m-1;
        //assign pointer 2 to the last element of nums2 array
        int p2 = n-1;
        //index for output array
        int i = m+n-1;
        //As long as p1 and p2 are greater that or equal to 0
        while(p1>=0 && p2 >=0)
        {
            //If the value at p1 pointer is greater than the value at p2 pointer in the respective arrays
            if(nums1[p1] > nums2[p2])
            {
                //store the larger element at i position in nums1
                nums1[i] = nums1[p1];
                //decrement p1 pointer
                p1--;
            }
            
            else 
            {
                //Else store the element of p1 points of nums 1 array to nums1 array
                nums1[i] = nums2[p2];
                //decrement p2 pointer
                p2--;
            }
            //decrement i pointer
            i--;
        }
        //if p2 pointer is still greater than or equal to 0 
        while (p2>=0)
        {
            //store the values in nums2 array to nums1 array at i position
            nums1[i] = nums2[p2];
            //decrement p2 pointer and i
            p2--;
            i--;
        }
    }
}