
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
Take 2 pointers. Fast to count the number of times the number repeats, and slow to store those values.
return the length of the slow which is slow+1;
If the count<= k , k number of repeated number elements. then increment the slow and store the value at fast.
*/

// Your code here along with comments explaining your approach



#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n = nums.size();
        int p1{0},p2{1},count{1};
        while(p2<n){
            if(nums.at(p2) == nums.at(p2-1)) count++; //fast and slow can also be compared.
            else count = 1;
            if(count<=2){
                nums.at(++p1) = nums.at(p2);
            }
            p2++;
        }
    return ++p1;
    }
};