class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      Arrays.sort(intervals, (a, b)->Integer.compare(a[1],b[1]));
       int arrow = 0, end = intervals[0][1];
       for(int i = 1; i <intervals.length; i++){
           if(intervals[i][0] >= end){
            
               end = intervals[i][1];
           }else{
               arrow++;
           }
       }
        return arrow;   
    }
}