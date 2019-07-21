//
// Created by shazm on 7/21/2019.
//

#include <iostream>
#include <algorithm>
#include <vector>
#include <climits>

using namespace std;

class Solution{
public:
    int removeDuplicates(vector<int>& nums) {
        int firstP; int secondP = INT_MAX;
        vector<int>::iterator it = nums.begin();
        while(it!=nums.end()){
            if((it-nums.begin())==0 || nums[(it-nums.begin())]!=firstP){
                firstP = nums[(it-nums.begin())]; secondP = INT_MAX; it++;
            }else if(nums[(it-nums.begin())]==firstP && secondP == INT_MAX){
                secondP = nums[(it-nums.begin())]; it++;
            }else{
                nums.erase(it);
            }
        }
        return nums.size();
    }
};

int main(){
    Solution s;
    vector<int> vec{1,2};
    cout<<s.removeDuplicates(vec)<<endl;
    return 0;
}