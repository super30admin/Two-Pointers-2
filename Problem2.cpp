/*


// Time Complexity : O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

The arrays given are sorted. So we will take use of the extra space of the nums1 to insert the values of num2.
Take 2 pointers at array 1 and array 2, compare store the larger value and decrease the pointer of the larger value
Repeat untill all the elments from the array2 are in array1;

// Your code here along with comments explaining your approach

*/



#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int g {m+n-1};
        int p1{m-1},p2{n-1};
        while(p1>=0 && p2>=0){
            if(nums1.at(p1)>nums2.at(p2)) nums1.at(g--) = nums1.at(p1--);
            else nums1.at(g--) = nums2.at(p2--);
        }
        while(p2>=0) nums1.at(g--) = nums2.at(p2--);
    }
};