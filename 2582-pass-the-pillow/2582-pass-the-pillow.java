class Solution {
    public int passThePillow(int n, int time) {
      int gap = n - 1;
      int x = time / gap;
        int mod = time % gap;
        int[] arr = new int[n];
        int j = 1;
      for(int i = 0; i < n; i++){
          arr[i] = j;
          j++;
      }
        
        
        if( x % 2 == 0){
            return arr[time % gap];
        }
        
        return arr[gap - mod];
    }
}