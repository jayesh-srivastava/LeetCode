class Solution {
    public int maxSubArray(int[] a) {
        int size = a.length; 
        int maxsofar = Integer.MIN_VALUE, maxendinghere = 0; 
  
        for (int x = 0; x < size; x++) 
        { 
            maxendinghere = maxendinghere + a[x]; 
            if (maxsofar < maxendinghere) 
                maxsofar = maxendinghere; 
            if (maxendinghere < 0) 
                maxendinghere = 0; 
        } 
        return maxsofar;
        
    }
}
