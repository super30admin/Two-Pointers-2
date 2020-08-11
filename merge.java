//time complexity: O(m+n) we are traversing through both the arrays 
//space complexity: O(1)
//executed on leetcode: yes
//approach:
//we use three pointers where m will be at the first non zero digit from the end of nums1 and n will be the last element of nums2
//place pointer tells you where the zero will be replaced by the larger number among nums1[m] and nums2[n]


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int place = m+n-1;
        m--;
        n--;
        while(m>=0 && n>=0)
        {
            if(nums1[m]<nums2[n]) nums1[place--] = nums2[n--];
            else nums1[place--] = nums1[m--];
        }
        while(n>=0) // case when m becomes -1 before n does in the upper loop, this can happen in case nums1 = [1,2,3,0,0,0] and nums2=[0,0,0]
        {
            nums1[place--] = nums2[n--];
        }
    }
}