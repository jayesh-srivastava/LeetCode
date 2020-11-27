package SingleNumber;
import java.util.*;
class Solution
{
    public int singleNumber(int[] nums)
    {
        int l=nums.length;
        Arrays.sort(nums);
        int r=0;
        Map<Integer,Integer> mp= new HashMap<>();
        for(int x=0;x<l;x++)
        {
            if (mp.containsKey(nums[x]))
            {
                mp.put(nums[x], mp.get(nums[x])+1);
            } else
            {
                mp.put(nums[x], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            if(entry.getValue()==1)
            {
                r=entry.getKey();
            }
        }
        return r;
    }

