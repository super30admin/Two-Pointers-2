//Time complexity - O(m+n)
//space complexity - O(1)
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int n1 = m-1,n2 = n-1, run = m+n-1;
        
        while(n1>=0 && n2>=0){
            
            if(nums1[n1]>nums2[n2]){
                nums1[run] = nums1[n1];
                n1--;
            }else{
                nums1[run] = nums2[n2];
                n2--;
            }
            run--;
            
        }
        if(n2>=0){
            while(run>=0){
                nums1[run] = nums2[n2];
                n2--;
                run--;
            }
        }

    }
};