class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        int flag=-1;
        int length=needle.length();
        for(int x=0;x<=(haystack.length()-needle.length());x++) {
            String sub=haystack.substring(x,length);
            if(sub.equalsIgnoreCase(needle)) {
                flag=x;
                x=haystack.length();
            }
            length++;
        }
        return flag;
    }
}
