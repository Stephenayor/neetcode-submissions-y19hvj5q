class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedValue = new String(charArray);
            anagramsMap.putIfAbsent(sortedValue, new ArrayList<>());
            anagramsMap.get(sortedValue).add(str);
        }
        return new ArrayList<>(anagramsMap.values());
    }
}
