class Solution {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int[] arr = new int[arr1.length]; 
    HashMap<Integer, Integer> mp = new HashMap<>(); 
    for (int num : arr1) {
      mp.put(num, mp.getOrDefault(num, 0) + 1);
    }

    int j = 0;
    for (int num : arr2) {
      if (mp.containsKey(num)) {
        int count = mp.get(num);
        for (int i = 0; i < count; i++) {
          arr[j++] = num;
        }
        mp.remove(num); 
      }
    }
    List<Integer> remaining = new ArrayList<>(); 
    for (int num : mp.keySet()) {
      remaining.add(num);
    }
    Collections.sort(remaining); 
    for (int num : remaining) {
      for (int i = 0; i < mp.get(num); i++) { 
        arr[j++] = num;
      }
    }

    return arr;
  }
}


