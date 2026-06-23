class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for(String str: strs){
            int[] count = new int[26];
            for(char character: str.toCharArray()){
                count[character -'a']++;
            }
            String uniqueKey = Arrays.toString(count);
            anagramsMap.putIfAbsent(uniqueKey, new ArrayList<>());
            anagramsMap.get(uniqueKey).add(str);
        }
        return new ArrayList<>(anagramsMap.values());
    }
}
