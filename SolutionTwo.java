
// Time Complexity :O(m+n)
// Space Complexity :O(m)
// Did this code successfully run on Leetcode : yes

class SolutionTwo {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(nums1==null||nums1.length==0)
            return;

        int ptr1=m-1;//position at mth index
        int ptr2=n-1; //position at nth index
        int i=m+n-1;//postion poiter at the last index

        while(ptr1>=0&&ptr2>=0)
        {
            if(nums1[ptr1]>nums2[ptr2])
            {
                nums1[i]=nums1[ptr1];
                ptr1--;
            }
            else
            {
                nums1[i]=nums2[ptr2];
                ptr2--;
            }
            i--;

        }
        while(ptr2>=0)
        {
            nums1[i]=nums2[ptr2];
            i--;
            ptr2--;
        }
    }
}