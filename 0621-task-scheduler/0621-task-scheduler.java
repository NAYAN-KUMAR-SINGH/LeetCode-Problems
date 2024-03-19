class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] f = new int[26];
        for(char task:tasks){
            f[task - 'A']++;
        }
        Arrays.sort(f);
        int chunks = f[25] - 1;
        int Ispot = chunks * n;
        
        for(int i = 24; i >= 0; i--){
            Ispot = Ispot - Math.min(chunks, f[i]);
        }
        
        return Ispot < 0? tasks.length : Ispot + tasks.length;
    }
}