class Solution {
    public int countSeniors(String[] details) {
       int count = 0;
      for(int i = 0; i < details.length; i++){
         int sum = (details[i].charAt(11) - '0')*10 + (details[i].charAt(12) - '0');
        if(sum > 60){
            count++;
        }
       } 
       return count;         
    }
}