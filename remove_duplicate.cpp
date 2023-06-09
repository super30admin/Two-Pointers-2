class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n = nums.size();

    //     int index = 0;
    //     for(int i=0;i<=n;i++){
    //         if( (index<2 && i<2 ) || nums[i]!=nums[index-2] ){
    //                 nums[index++] = nums[i];
    //         }
    //     }
    //     return index;
    // 

    int first = 0;
    int second = 1;
    int count = 1;
    int k = 2;
        while (second<n){

            if(nums[first] == nums[second]){
                count++;   
            }
            else{
                count = 1;
            }
             if(count<= k){
                       first++;
                    nums[first] = nums[second];
                 
               
                }
                 second++ ;
        }
        return first+1;
    }
};