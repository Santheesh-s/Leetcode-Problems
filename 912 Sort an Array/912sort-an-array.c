/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* sortArray(int* nums, int n, int* rs) {
    *rs=n;
    int j,key;
    for(int i=0;i<n;i++)
    {
        j=i;
        key=nums[i];
        while(j>0 && nums[j-1]>key)
        {
            nums[j]=nums[j-1];
            j-=1;
        }
        nums[j]=key;
    }
    return nums;
}