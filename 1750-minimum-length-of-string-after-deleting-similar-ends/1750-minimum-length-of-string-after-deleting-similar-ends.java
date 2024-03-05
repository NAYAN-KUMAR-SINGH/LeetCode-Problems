class Solution {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char lChar = s.charAt(left);
            char rChar = s.charAt(right);

            if (lChar == rChar) {
                while (left < right && s.charAt(left) == lChar) {
                    left++;
                }
                while (left <= right && s.charAt(right) == rChar) {
                    right--;
                }
            } else {

                break;
            }
        }

        return Math.max(right - left + 1, 0);
    }
}
