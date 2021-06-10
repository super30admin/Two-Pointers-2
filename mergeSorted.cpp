class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        
        int i=nums2.size()-1;
        int j=nums1.size()-1;
            int k = nums1.size()/2 -1;
        
        while(k>=0 and i>=0)
        {
            if(nums2[i]>nums1[k])
            {
                nums1[j]=nums2[i];
               i--;
                j--;
            }
            else if(nums1[k]>nums2[i]){
                nums1[j]=nums1[k];
                k--;
                j--;
                
            }
            
        }
        while(k>0)
        {
            nums1[j]=nums1[k];
            k--;
        }
        while(i>0)
        {
            nums1[j]=nums2[i];
            i--;
        }
        
    }
};
