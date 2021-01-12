
// Time Complexity : O(m+n) where m is row of nums matrix and n is column of nums matrix
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
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        
        if(matrix.empty()) return false;
        int m=matrix.size();
        int n=matrix[0].size();
        
        //chose the last element in first row
        //traverse
        //if the target is bigger than the present element 
        //increment i and j is constant
        //else decrement j and i is constant
        int i=0;
        int j=n-1;
        while(i<m && j>=0){
            if (target==matrix[i][j]) return true;
            else if(target>matrix[i][j]){
                i++;               
                
            }else{
                j--;
                
            }
        }
        return false;
        
        
        
    }
};

int main(){
    Solution a;
    vector<vector<int> > nums={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
    int target=5;
    bool b = a.searchMatrix(nums,target);
    // for (int x : b) 
    //     cout << x << " "; 

    // can either do this below for answer in true false 
    // cout.setf(std::ios::boolalpha);
    // cout <<  b << endl;

    // or

    cout <<  boolalpha << b << endl;

}