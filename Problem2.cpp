//
// Created by shazm on 7/21/2019.
//

#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        vector<int>::iterator it;
        for(int x =0 ; x<n; x++){
            it = upper_bound(nums1.begin(),nums1.begin()+m,nums2[x]);
            cout<<(it-nums1.begin())<<endl;
            nums1.insert(it,nums2[x]);
            cout<<nums1[(it-nums1.begin())]<<endl;
            nums1.erase(nums1.end());
            for(int x: nums1){
                cout<<x<<endl;
            }
        }
    }
};

int main(){
    Solution s;

    return 0;
}