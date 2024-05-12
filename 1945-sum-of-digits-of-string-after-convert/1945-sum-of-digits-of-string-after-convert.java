class Solution {
    public String findSum(String num) {
        long sum = 0;
        for (int i = 0; i < num.length(); i++) {
            char digitChar = num.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            sum += digit;
        }
        return String.valueOf(sum); 
    }

    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
          int num = ch - 'a' + 1; 
            sb.append(num);
        }
        System.out.println(sb);
        for (int i = 0; i < k; i++) {
            String sumStr = findSum(sb.toString()); 
            sb = new StringBuilder(sumStr); 
        }

        // Convert the final sum back to an integer
        return Integer.parseInt(sb.toString());
    }
}



