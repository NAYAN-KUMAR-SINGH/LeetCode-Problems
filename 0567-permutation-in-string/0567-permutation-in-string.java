class Solution {
    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public boolean checkInclusion(String s1, String s2) {
        s1 = sortString(s1);
        
       for (int i = 0; i <= s2.length() - s1.length(); i++) {
    String s3 = sortString(s2.substring(i, i + s1.length()));
    if (s3.equals(sortString(s1))) {
        return true;
    }
}

        
        return false;
    }
}