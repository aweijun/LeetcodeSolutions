class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hash.containsKey(s.charAt(i))) {
                hash.put(s.charAt(i), -1);
            } else {
                hash.put(s.charAt(i), i);
            }
        }
        
        List<Integer> mapValues = new ArrayList<>(hash.values());
        Collections.sort(mapValues);
        for (int j = 0; j < mapValues.size(); j++){
            if (mapValues.get(j) > -1) {
                return mapValues.get(j);
            } else {
                continue;
            }
        }
        return -1;
    }
}