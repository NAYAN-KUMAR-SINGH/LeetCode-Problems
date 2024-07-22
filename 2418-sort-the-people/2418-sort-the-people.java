class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] st = new String[heights.length];
        HashMap<Integer, String> mp = new HashMap<>();
        for(int i = 0; i < names.length; i++){
            mp.put(heights[i], names[i]);
        }
        int j = 0;
        Arrays.sort(heights);
        for(int i = 0; i < heights.length; i++){           
                st[j] = mp.get(heights[heights.length - i - 1]);
                j++;            
        }
        
        return st;
    }
}