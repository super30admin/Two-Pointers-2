class Solution {
public:
    //Time Complexity(O(n logn)) - which is good if n is larger but in general for smaller cases, O(m+n) would be faster.
//     void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
//         for( int i=0;i<m;i++)nums2.push_back(nums1[i]);
//         nums1.clear();
//         sort(nums2.begin(), nums2.end());
//         nums1=nums2;
        
//     } 
void merge(vector<int>& a, int m, vector<int>& b, int n) {
   int p1 = m-1;
   int p2 = n-1;
   int idx = (m+n)-1;
   while(p1>=0 && p2>=0){
       if(a[p1]>=b[p2]){
           a[idx--]=a[p1--];
       }
       else{
           a[idx--]=b[p2--];
       }
   }
   while(p2>=0){
        a[idx--]=b[p2--];
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
    // int i=m-1,j=n-1,k=m+n-1;
    // while(i>=0 && j>=0){
    //     if(a[i]>=b[j]){
    //         a[k]=a[i];
    //         k--;
    //         i--;
    //     }
    //     else{
    //     a[k]=b[j];
    //         j--;
    //         k--;
    //     }
    // }
    // while(j>=0){
    //     a[k--]=b[j--];
    // }

    // 
    }
};
