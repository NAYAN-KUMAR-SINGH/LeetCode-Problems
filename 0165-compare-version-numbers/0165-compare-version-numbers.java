import java.util.ArrayList;

class Solution {
    public int compareVersion(String version1, String version2) {
        ArrayList<Integer> list = parseVersion(version1);
        ArrayList<Integer> list1 = parseVersion(version2);

        int maxLength = Math.max(list.size(), list1.size());

        for (int i = 0; i < maxLength; i++) {
            int num1 = (i < list.size()) ? list.get(i) : 0;
            int num2 = (i < list1.size()) ? list1.get(i) : 0;
            if (num1 != num2) {
                return Integer.compare(num1, num2);
            }
        }

        return 0;
    }

    private ArrayList<Integer> parseVersion(String version) {
        String[] parts = version.split("\\.");
        ArrayList<Integer> list = new ArrayList<>();
        for (String part : parts) {
            list.add(Integer.parseInt(part));
        }
        return list;
    }
}
