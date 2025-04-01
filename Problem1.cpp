// Time Complexity : O(N) N is size of array
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach:
// 1. Take 2 pointers fast and slow increase fast in each travers.
// 2. If counter is less than k increase slow and counter.
// 3. Whenever fast pointer and its previous is different take counter as 0

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int s=0,f=0,k=2,c=0;
        int f1=nums[0],f2=nums[0];
        int n=nums.size();
        while(f<n){
            
            if(c<k){
                nums[s]=nums[f];
                c++;s++;
            }
            f++;
            if(f>=n){
                break;
            }
            f1=f2;f2=nums[f];
            if(f1!=f2){
                c=0;
            }
            
            //cout<<s<<' '<<f<<' '<<c<<'\n';
        }
        return s;
    }
};