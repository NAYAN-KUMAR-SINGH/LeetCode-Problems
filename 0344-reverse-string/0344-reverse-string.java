class Solution {
    public void reverseString(char[] s) {
       
        
        int n=s.length;
        int li=0;
        int hi=n-1;
        while(li<hi){
            char temp=s[li] ;
            s[li]=s[hi];
            s[hi]=temp;
            li++;
            hi--;
        }
        
    }
}