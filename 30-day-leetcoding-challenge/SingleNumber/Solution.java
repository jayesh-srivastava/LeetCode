package SingleNumber;
import java.util.*;
import java.lang.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]= new int [5];
        for(int x=0;x<=4;x++)
        {
            arr[x]=sc.nextInt();
        }
        Arrays.sort(arr);
        Map<Integer,Integer> mp= new HashMap<>();
        for(int x=0;x<=4;x++) {
            if (mp.containsKey(arr[x])) {
                mp.put(arr[x], mp.get(arr[x])+1);
            } else {
                mp.put(arr[x], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println(entry.getKey());
                System.exit(0);
            }
        }

    }
}
