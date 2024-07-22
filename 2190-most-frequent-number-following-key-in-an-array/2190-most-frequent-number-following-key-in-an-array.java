class Solution {
  
    public static int findHighestFrequencyNumber(ArrayList<Integer> list) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : list) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        int maxFrequency = 0;
        int mostFrequentNumber = -1;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentNumber = entry.getKey();
            }
        }

        return mostFrequentNumber;
    }
    public int mostFrequent(int[] nums, int key) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == key){
              list.add(nums[i + 1]);
            }
        }
        
        return findHighestFrequencyNumber(list);
    }
}