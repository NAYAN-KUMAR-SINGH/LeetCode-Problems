class Solution {
    public long dividePlayers(int[] skill) {
       Arrays.sort(skill);
       int sum = 0;
        long product = 1;
        
       int i = 0;
       int j = skill.length - 1;
       sum = skill[i] + skill[j];
        product = skill[i] * skill[j];
        i++;
        j--;
        while(j > i){
          if(sum != (skill[i] + skill[j])){
              return -1;
          }else{
             product += skill[i] * skill[j];
          }
           i++;
            j--;
        }
       return product; 
    }
}