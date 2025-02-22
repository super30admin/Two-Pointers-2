#include <bits/stdc++.h>
#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
using namespace std;

void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
    int p = nums1.size()-1,p1=m-1,p2=n-1;
    while(p1>=0&&p2>=0){
        if(nums1[p1]>=nums2[p2]){
            nums1[p]=nums1[p1];
            p1--;
        }
        else{
            nums1[p]=nums2[p2];
            p2--;
        }
        p--;
    }
    while(p2>=0){
        nums1[p]=nums2[p2];
        p2--;
        p--;
    }
}

int main(){
    vector<int> nums1 = {1,2,3,0,0,0};
    vector<int> nums2 = {2,5,6};
    merge(nums1,3,nums2,3);
    for(int i=0;i<nums1.size();i++){
        cout<<nums1[i]<<" ";
    }
    return 0;
}
// Time Complexity: O(n)    
// Space Complexity: O(1)
// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]