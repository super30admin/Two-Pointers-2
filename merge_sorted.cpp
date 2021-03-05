//TC: O(n+m) where m and n are sizes of each array respectively.
//SC: O(m) since we use a buffer 

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        
        //create a copy of nums1, and work with that.
        // vector<int> nums1copy;
        
        // for(int i=0; i<nums1.size(); i++)
        //     nums1copy.push_back(nums1[i]);
        
//         int p=0;//write 
//         int p1=0;//read nums1
//         int p2=0;//read nums2
        
//         for(p=0; p<m+n; p++){
            
//             if(p2 >= n || (p1<m && nums1copy[p1]<nums2[p2]))
//                 nums1[p] = nums1copy[p1++];
            
//             else
//                 nums1[p] = nums2[p2++];
            
//         }
        
        
                
        int p1 = m-1;
        int p2 = n-1;
        
        for(int p=m+n-1; p>=0; p--){
            
            if(p2 < 0)
                break;
            
            if(p1 >=0 && nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1];
                p1--;
            } else{
                nums1[p] = nums2[p2];
                p2--;
            }
            
        }
        
    }
};