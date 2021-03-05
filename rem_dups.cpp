//TC: O(N) where N is number of elements
//SC: O(1)


class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int j=1;
        int count=1;
        for(int i=1; i<nums.size(); i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            
            //if there is a maximum of 1 duplicate for each element, then increment i and j. Increment j at this juncture. 
            //if j is not incremented, then j stays at the point where the second unwanted duplicate exists and this value will get overwritten.
            if(count <=2){
                nums[j] = nums[i];
                j++;
            }
            
        }
        
        return j;
        
    }
};