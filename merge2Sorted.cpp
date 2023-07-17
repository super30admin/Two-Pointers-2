
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
I take 1 last pointer to keep track of the position I need to be inserting, and 2 pointers 
pointing(first and last2) to 2 indexes that needs to be compared from the nums1 array and nums2 array.

I will be traversing from the end to the beginning in this problem.

I will compare the first and last2 pointers and which one is greater ill insert it into
last pointer in nums1 array. Then ill be decrementing the last pointer in nums1 and decrementing
which pointer was greater out of first and last2.

1 edge case to be considered is when the nums1 array is traversed before the nums2 array
in that case all the elements remain in the nums2 array will be moved the last pointer of
the nums1 array.

*/

// Your code here along with comments explaining your approach


#include <iostream>
#include <vector>

using namespace std;


class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {

        int last = m+n-1;
        int first=m-1;

        int last2 = n-1;

        while(first>=0 & last2>=0){
            if(nums1[first]>nums2[last2]){
                nums1[last]=nums1[first];
                first--;
                
            }

            else{
                nums1[last]=nums2[last2];
                
                last2--;

            }
            last--;
        }
        

        while(last2>=0){
            nums1[last]=nums2[last2];
            last--;
            last2--;

        }

       

        
        
    }
};