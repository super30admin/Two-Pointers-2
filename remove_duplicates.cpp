
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//1.Edge case
//A. return if size <=2
//2. logic
//A. Count the number of occurances and place the first pointer at third occurence
//B. Place the second pointer at the transition and replace
//C. return the position of the pointer at the start of the invalid array (first pointer)

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        //1.A
        if(nums.size()<=2){
            return (int) nums.size();
        }
        
        int i=1, j=1;
        int count=1;
        
        //2.
        while(i<nums.size()){
            
            if(nums[i] ==nums[i-1]){
                count++;
            }else{
                count =1;
            }
            
            if(count<=2){
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        
        return j;
    }
};
