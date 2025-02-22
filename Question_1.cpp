#include <bits/stdc++.h>
#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
using namespace std;
int removeDuplicates(vector<int>& nums) {
    int i=0,curr=-1,count=0,n=nums.size();
    for(int j=0;j<=n-1;j++){
        if(nums[j]==curr){
            count++;
            if(count<=2){
                swap(nums[i],nums[j]);
                i++;
            }
        }
        else{
            count=1;
            curr=nums[j];
            swap(nums[i],nums[j]);
            i++;
        }
    }
    return i;
}

int main(){
    vector<int> nums = {1,1,1,2,2,3};
    cout<<removeDuplicates(nums);
    return 0;
}
// Time Complexity: O(n)
// Space Complexity: O(1)
// Input: [1,1,1,2,2,3]
// Output: 5
// Explanation: The first five elements of the array are 1, 1, 2, 2, 3. The remaining elements are not relevant.    
