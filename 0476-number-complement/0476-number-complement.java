class Solution {
    public int findComplement(int num) {
        int numBits = (int)(Math.log(num) / Math.log(2)) + 1;
        int allOnes = (1 << numBits) - 1;
        return allOnes - num;
    }
}
