// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes

// Three line explanation of solution in plain english
// iterate over the array using two pointers(j-slow pointer i-fast pointer)
// pointer j is used to update array based on the count-ass long as count< 2 update j with the value of i 
// compare element at i with its preceeding value if its equal just incremnt count else rest count





class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i =1;int j=1; int count=1;
        while(i < nums.size()){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count =1;
            }
            if(count <=2){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
};