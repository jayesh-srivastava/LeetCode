class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        Set<Integer> set=new HashSet<>();
        do {
            sum=0;
            while(n!=0) {
                int d=n%10;
                n=n/10;
                sum+=d*d;
            }
            n=sum;
        }while(n>1 && set.add(n));
        if(n>1)
            return false;
        else
            return true;
    }
}
or
 class Solution {
 public boolean isHappy(int n) {
        int sl = n, fa = n;
        do {
            sl = calcu(sl);
            fa = calcu(calcu(fa));
        } while (sl != fa);
        return sl == 1;
    }

    private int calcu(int n) {
        int rem = 0;
        while (n > 0) {
            int d = n % 10;
            rem += d * d;
            n /= 10;
        }
        return rem;
    }
}
