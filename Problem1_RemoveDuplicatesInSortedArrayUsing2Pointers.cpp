
// Time Complexity : O(n) where n is number of elements
// Space Complexity : O(1) we are not using extra space
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach


#include<vector>
#include<bits/stdc++.h>
#include<stdlib.h>
#include<cmath>
#include<time.h>
#include<iostream>

using namespace std; 

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.empty()) return 0;
        if(nums.size()==1) return 1; 
        
        //now we have to assign two pointer slow and fast
        //slow pointing to 0 the lement and fast the next element
        
        int slow=1;
        int fast=1;
        int count=1;
        //we compare fast element with previous element
        //if the previous element is same as fast element and count is less than or equal to 2 then increment slow also
        // if the count is more than 2 and the next element is same as previous element then dont increment slow pointer and just increment fast pointer
        // increment fast ppinter till there is a new element where we have to change both fast and slow pointer by 1 and change count to 0.  
        
        for(fast=1;fast<nums.size();fast++){
            
            if(nums[fast]==nums[fast-1]){
                //nums[slow]=nums[fast];
                //slow++;
                count++;             
            }else{            
                count=1;           
            }if(count<=2){
                nums[slow]=nums[fast];
                slow++;          
            }
            
        }
        
        //while loop implementation is below
        
        // while(fast<nums.size()){
        //     if(nums[fast]==nums[fast-1]){
        //         //nums[slow]=nums[fast];
        //         //slow++;
        //         count++;             
        //     }else{            
        //         count=1;           
        //     }if(count<=2){
        //         nums[slow]=nums[fast];
        //         slow++;          
        //     }
        //     fast++;            
        // }
        nums.resize(slow);
        return slow;                
    }
};

int main(){
    Solution a;
    vector<int>  nums={0,0,1,1,1,1,2,3,3};
    //int target=5;
    int b = a.removeDuplicates(nums);
    for (int x : nums) 
         cout << x << " "; 

    cout<<endl;

    // can either do this below for answer in true false 
    // cout.setf(std::ios::boolalpha);
    // cout <<  b << endl;

    // or

    cout <<  boolalpha << b << endl;

}