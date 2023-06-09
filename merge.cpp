class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        vector<int> ans;
            int m_ptr = m-1;
            int n_ptr = n-1;
            int k = m+n-1;

    while(m_ptr>=0 && n_ptr>=0){

        if(nums1[m_ptr]>=nums2[n_ptr]){
                nums1[k] = nums1[m_ptr];
               k--; 
                m_ptr--;
        }
        else{
            nums1[k] = nums2[n_ptr];
           k--; 
            n_ptr--;
        }
           
    }
    while(n_ptr >= 0){
        nums1[k] = nums2[n_ptr];
         n_ptr--;
        k--;
       

    }

      
    }
};