//Time Complexity - O(n)
//Space Complexity - O(1)
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n=nums.size(),i=1,j=1,c=1;
        for(i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                c++;
            }
            else{
                c=1;
            }
            if(c<=2){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
};