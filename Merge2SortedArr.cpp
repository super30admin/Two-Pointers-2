#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
/*
take two pointers i on the first array and j on the second
declare another variable k which is the sum of the size of both the arrays
then while j is greater than zero and if i greater than equal to 0 assign the first array with that element
else assign the first array with the element in the second array
*/
class Solution{
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n){
        int i=m-1, j=n-1, k=m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }else{
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
    }
};
