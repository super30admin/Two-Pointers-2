//
//  main.cpp
//  80_Remove_Duplicates_from_Sorted_Array2
#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    /*
    Two pointers, p pointing to begining of array and i pointing to first element.
    TC: O(N),  N = size of array.
    */
    
    int removeDuplicates(vector<int>& nums) {
        if(nums.size()==0)
            return 0;
        if(nums.size()<=2) return nums.size();
        int p=0, c=1, i=1;
        bool flag=true; // true if <2 //false == 2 make;
        
        while(c < nums.size()){
            if(nums[p] == nums[c]){
                if(flag==true){
                    nums[i]=nums[c];
                    c++;
                    i++;
                    flag=false;
                }
                else{
                    c++;
                }
            }
            else{
                nums[i] = nums[c];
                p = c;
                flag = true;
                c++;
                i++;
            }
           
        }
        return i;
        
    }
    
    /* Brute Force apprach - Using hashmap
    TC: O(max(N,maxelement)), SC: O(N),  N = size of array;
    int removeDuplicates(vector<int>& nums) {
        if(nums.size()==0)
            return 0;
        map <int, int> tracker;
        for(int i = 0; i < nums.size(); i++)
        {
            if(tracker[nums[i]]<2){
                tracker[nums[i]]=tracker[nums[i]]+1;
            }
        }
        int j=0;
        for(auto i:tracker){
            int count=i.second;
            while(count>0){
                nums[j++]=i.first;
                count--;
            }
        }
        return j;
    }*/
};


int main(int argc, const char * argv[]) {
    vector<int> nums={0,0,1,1,1,1,2,3,3};
    Solution s;
    s.removeDuplicates(nums);
    for(int i=0;i<nums.size();i++){
        cout<<nums[i]<<"\t";
    }
    return 0;
}
