class Solution {
    public String intToRoman(int num) {
 String[] thousands = {"", "M", "MM", "MMM"};
 String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
 String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
 String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};   
       
      int t = num / 1000;   
      num = num % 1000;
      int h = num / 100;
      num = num % 100;
      int te = (num) / 10;
      int o = num % 10; 
        
   
     
        
     return thousands[t] + hundreds[h] + tens[te] + ones[o];   
    }
}