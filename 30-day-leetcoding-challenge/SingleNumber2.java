class Solution
{
    public int singleNumber(int[] nums)
    {
        int l=nums.length;
        Arrays.sort(nums);
        int x=0;
        while(x<l-1)
        {
            if(nums[x]==nums[x+1])
            {
                x+=2;
            }
            else
            {
                return nums[x];
            }
        }
        return nums[x];
    }
}
