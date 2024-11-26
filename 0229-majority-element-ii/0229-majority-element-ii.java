class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
       for (int i = 0; i < nums.length; i++) {
        if (mp.containsKey(nums[i])) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        } else {
            mp.put(nums[i], 1);
        }
      }
        
        for (Integer key : mp.keySet()) {
          int value = mp.get(key);
          if(value > (n / 3)){
              list.add(key);
          }
      }
        
        return list;
    }
}