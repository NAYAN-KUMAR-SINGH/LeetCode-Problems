class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] arr = new int[deck.length];
        boolean isSkip = false;
        int n = deck.length;
        int j = 0;
        for(int i = 0; j < deck.length; i = (i + 1)%n){
            if(arr[i] == 0){
                if(isSkip == false){
                 arr[i] = deck[j];
                j++;   
                }
               
                isSkip = !isSkip;
            }
        }
        
        return arr;
    }
}