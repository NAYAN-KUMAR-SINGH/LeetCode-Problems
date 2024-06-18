class Solution {
    public boolean judgeSquareSum(int c) {
      long b = (long)Math.sqrt(c), a = 0;
       while(a <= b){
           long r = a * a + b * b;
           if(r == c){
               return true;
           }else if(r < c)a++;
           else b--;
       }
        return false;
    }
}