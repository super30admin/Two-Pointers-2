//TC: O(m+n)
//SC: O(1)
//Approach:Start with 2 pointers ptr1 & ptr2 and the end of nums1 &nums2 respectively.
//compare ptr1 and ptr 2 and place the larger one at index.
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int ptr1 =m-1;
        int ptr2 = n-1;
        int ind = m+n-1; //track of postion to place element
        while(ptr2>=0 && ptr1>=0){
          if(nums1[ptr1]>=nums2[ptr2]){
            nums1[ind] = nums1[ptr1];
            ptr1--;
          }
          else{
            nums1[ind] = nums2[ptr2];
            ptr2--;
          }
          ind--;
        }
        while(ptr2>=0){
            nums1[ind] = nums2[ptr2];
            ptr2--;
            ind--;
        }
    }
};