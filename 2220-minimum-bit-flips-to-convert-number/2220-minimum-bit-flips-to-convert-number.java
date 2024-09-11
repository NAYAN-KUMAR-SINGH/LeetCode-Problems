class Solution {
    public int minBitFlips(int start, int goal) {
        String starts = Integer.toBinaryString(start);
        String goals = Integer.toBinaryString(goal);
        int maxLength = Math.max(starts.length(), goals.length());
        starts = String.format("%" + maxLength + "s", starts).replace(' ', '0');
        goals = String.format("%" + maxLength + "s", goals).replace(' ', '0');
        
        int count = 0;
        for (int i = 0; i < maxLength; i++) {
            if (starts.charAt(i) != goals.charAt(i)) {
                count++;
            }
        }
        
        return count;
    }
}
