
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*set 2 ptrs at end of arrays and 1 ptr at the end of last valid element in the first array
check greater and add to the end of list, and decrement ptr. This will give us sorted array.
*/

// Your code here along with comments explaining your approach

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int ptr1 = m-1; // set to last element in 1
        int ptr2 = n-1; // set to last element in 2
        int high = m+n-1;  // set to the total size of 1
        while(ptr1>=0 && ptr2>=0)
        {
            if(nums1[ptr1] > nums2[ptr2])
            {
                nums1[high] = nums1[ptr1]; // put it to the end of array1 and decrement ptr
                high--; ptr1--;
            }
            else{
                nums1[high] = nums2[ptr2];  // else put 2 array element to the end of array1 and decrement ptr
                high--; ptr2--;
            }
        }
        while(ptr2>=0){  // if element from 2 is left over, put it array 1
            nums1[high] = nums2[ptr2];
            high--; ptr2--;
        }
    }
};
// int main(){
    
//     return 0;
// }