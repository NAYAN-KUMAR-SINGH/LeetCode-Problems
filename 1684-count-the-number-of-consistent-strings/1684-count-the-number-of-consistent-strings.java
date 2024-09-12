class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      HashSet<Character> set = new HashSet<>();
      for(int i = 0; i < allowed.length(); i++){
          set.add(allowed.charAt(i));
      }
        
      int count = 0;
      for(int i = 0;i < words.length; i++){
          String str = words[i];
          int check = 0;
          for(int j = 0; j < str.length();j++){
              char ch = str.charAt(j);
              if(!set.contains(ch)){
                  check++;
              }
          }
          
          if(check == 0){
              count++;
          }
      }
        
        return count;
    }
}