#include<iostream>
#include<vector>
using namespace std;

int removeDuplicates(vector<int>& nums) {
    int j = 1,count = 1,size = nums.size();
    for(int i = 1; i < size; i++){
        if(nums[i] == nums[i - 1]){
            count++;
        }
        else {
            count = 1;
        }
        if(count <= 2){
            nums[j++] = nums[i];
        }
    }
    return j;
}


int main(){
    vector<int> nums{1,1,1,2,2,3,3};
    int length = removeDuplicates(nums);
    cout<<"Array with removed duplci"<<length;
    return 0;
}