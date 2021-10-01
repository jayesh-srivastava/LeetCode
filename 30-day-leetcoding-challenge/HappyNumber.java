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

//OR
class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = cal(slow);
            fast = cal(cal(fast));
        } while (slow != fast);
        return slow == 1;
    }

    private int cal(int n) {
        int res = 0;
        while (n > 0) {
            int d = n % 10;
            res += d * d;
            n /= 10;
        }
        return res;
    }
}
