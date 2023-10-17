class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
       int k=2;
       int n =nums.size();
       int slow =0;
       int count =0;
       for(int i =0;i<n;i++){
           if(i==0 || nums[i]!=nums[i-1]){
               count = 1;
           }
           else{
               count++;
           }
        if(count<=k){
            nums[slow++]=nums[i];
        }
       } 
       return slow;
    }
};
