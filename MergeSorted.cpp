//given two sorted arrays
// [1,2,3,3,5,6] 
// [2,5,6]
// [1,2,2,3,5,6]

// we can use the three pointer approach 
// but as the end part of the array 1 has the additional space we will start from end of the both array
// int p1 = m-1, int p2 = m-2
// int t= m+n

// now we store the max at t location and decrement whichever is stored 
// p1 = 6, p2 = 3
// t= 6 t--


class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int i = m+n-1;

        while(p2>=0)
        {
            if(p1>=0 && nums1[p1] > nums2[p2])
            {
                nums1[i--] = nums1[p1];
                p1--;
            }
            else
            {
                nums1[i--] = nums2[p2];
                p2--;
            }
        }

    }
};

//Time complexity O(N)
