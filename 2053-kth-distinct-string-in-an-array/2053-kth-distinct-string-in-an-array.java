class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        for (String s : arr) {
            mp.put(s, mp.getOrDefault(s, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
                if (count == k) {
                    return entry.getKey();
                }
            }
        }
        
        return "";
    }
}
