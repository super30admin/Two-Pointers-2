//remove duplicates from sorted array 2
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.size() == 0 || nums.empty()) return 0;

        int slow = 0;
        int fast = 1;
        bool flag = false;

        while(fast < nums.size()){
            if(nums[slow] == nums[fast]) {
                if(!flag){
                    flag = true;
                    slow++;
                    nums[slow] = nums[fast];
                    fast++;
                }else{
                    while(fast < nums.size() && nums[fast] == nums[fast - 1]){
                        fast++;
                    }
                  }
             }else{
                flag = false;
                slow++;
                nums[slow] = nums[fast];
                fast++;
            }
        }
       return slow + 1;
    }
};

//Time Complexity: O(n)
//Space Complexity: O(1)
