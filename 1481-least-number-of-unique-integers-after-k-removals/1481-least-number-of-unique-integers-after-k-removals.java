class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            list.add(count);
        }
        list.sort(Comparator.naturalOrder());
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) <= k){
                k -= list.get(i);
            } else {
                return list.size() - i;
            }
        }
        return 0;
    }
}