//mergeSortedArray

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int ptr1=m-1;
        int ptr2=n-1;
        int endptr = m+n-1;

        while (ptr1 >= 0 && ptr2 >= 0) {
            if (nums1[ptr1] <= nums2[ptr2]) {
                nums1[endptr] = nums2[ptr2];
                ptr2--;
            } else {
                nums1[endptr] = nums1[ptr1];
                ptr1--;
            }
            endptr--;
        }

        while (ptr2 >= 0 ) {
            nums1[endptr] = nums2[ptr2];
            ptr2--;
            endptr--;
        }


    }
};
