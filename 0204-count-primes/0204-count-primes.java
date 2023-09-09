class Solution {
    public int countPrimes(int n) {
        if(n==0||n==1){
            return 0;
        }
        int count=0;
        boolean[] primes = new boolean[n];
        primes[0]=true;
        primes[1]=true;
        for(int i=2;i < Math.sqrt(n);i++){
            if(primes[i]==false){
                for(int j=2;j*i<n;j++){
                    primes[i*j]=true;
                    
                }
            }
        }
    for(int i=2;i<n;i++){
        if(primes[i]==false){
            count++;
        }
    }
    return count;
    }
}