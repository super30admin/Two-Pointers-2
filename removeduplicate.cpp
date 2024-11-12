//T.C O(n)
//S.C O(1)
//Approach: fast to traverse all element and slow to keep track of pos to place valid element.Count duplicates of each element using cnt. reset cnt to 1 for a new element and increment it if the current element matches the previous one
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n = nums.size();
        int fast =0;
        int slow =0;
        int cnt =0;
        int k =2;
        while(fast<n){
             if(fast>0 && nums[fast]==nums[fast-1]){
                cnt++;
             }
             else{
                cnt =1;
             }
             if(cnt<=k){
                nums[slow]=nums[fast];
                slow++;
             }
             fast++;
        }
        return slow;
    }
};