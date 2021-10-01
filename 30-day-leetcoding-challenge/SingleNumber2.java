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
or
class Solution {
    public int singleNumber(int[] nums) {
      
        int c;
        for(int i=0;i<nums.length;i++){
          c=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]==nums[j]){
                        c++;
                    }
                }
            }
            if(c==0)
            {
                return nums[i];
             }
        }
        return 0;
    }
}
