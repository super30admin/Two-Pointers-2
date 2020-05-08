//Time comlpexity - O(n)
//Space complexity - O(1)
//Ran successfully on leetcode
//3 points algo is the following -
	//Brute force means you add the values of a2 into the end of a1 and then sort a1
    //We can do it using 3 pointers but we start from the end
    //1 pointer is at the end value of a1, one at the end of a2 and the final one is at the last index of a1

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if(nums1.empty())
            return;
        if(m==0)
        {
            nums1=nums2;
            return;
        }
        int p1=m-1;
        int p2=n-1;
        int i=m+n-1;
        while(p1>=0 && p2>=0)
        {
            if(nums1[p1]>nums2[p2])
            {
                nums1[i]=nums1[p1];
                p1--;
                i--;
            }
            else
            {
                nums1[i]=nums2[p2];
                p2--;
                i--;
            }
        }
        while(p2>=0)
        {
            nums1[i]=nums2[p2];
            i--;
            p2--;
        }
    }
};