class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int j =1;
        int count =1;
        int k = 2;
        for(int i =1; i< nums.size();i++){
            if(nums[i] == nums[i-1]){
                count++;
                    if(count<=k){
                        nums[j] = nums[i];
                        j++;
                    }}
                else if(nums[i]!= nums[i-1]){
                    count =1;
                    nums[j]=nums[i];
                    j++;    
                }
            }
    return j;    
    }
};
