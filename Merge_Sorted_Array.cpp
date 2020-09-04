//  86_Merge_sorted_array

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:

/*  Two pointers pointing (i, j) pointing to elements at m and n indices.
    If nums1 element is less than nums2 element, put nums1 element at index k (pointing to end of
    nums1 arra, else put nums2 element at index k. At the end, check if all the lements in nums2
    are processed , if not copy remaining elements to nums1.
    
    TC: O(m + n), m = nums1 array length, n = nums2 array length
    SC: O(1)
*/
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i = m - 1, j = n - 1;
        int k = m + n - 1;
        
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        
        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
    
    //Two pointers pointing to begining of each arrays
    /*
     
     Maintain two pointers pointing to begining of each arrays. keep a counter k=0. if nums1 element is less than nums2 keep incrementing both i and k, else shift right array1 elements starting from index i. Put current element of array2 to array1 at index i and increment both j and i. Check if any elements are still present in arra2 copy them to array1.

    TC: O((n+m)^2),  m = nums1 array length, n = nums2 array length
    SC: O(1)
    */

    void merge_1(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i=0, j=0, k=0;
        while (k < m && j < n)  {
            if (nums1[i] <= nums2[j]) k++;
            else {
                if(i != (m+n))
                {
                    for(int a = m + n - 1; a > i; a--){
                        nums1[a] = nums1[a-1];
                    }
                    nums1[i] = nums2[j];
                }
                j++;
            }
            i++;
        }
        if(j < n){
            while (j<n ){
                nums1[i++]=nums2[j++];
            }
            
        }
        
    }
    
};
int main(int argc, const char * argv[]) {
    vector<int> nums1={1,2,3,0,0,0};
    vector<int> nums2={2,5,6};
    int m=3, n=3;
    Solution s;
    s.merge(nums1, m, nums2, n);
    for(auto i:nums1){
        cout<<i<<"\t";
    }
    std::cout <<"\n";
    return 0;
}
