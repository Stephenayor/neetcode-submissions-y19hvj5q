class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> holdAnagramsMap = new HashMap<>();

        for(String str: strs){
            char[] strChar = str.toCharArray();
            Arrays.sort(strChar);
            String sortedString = new String(strChar);

            holdAnagramsMap.putIfAbsent(sortedString, new ArrayList<>());
            holdAnagramsMap.get(sortedString).add(str);
        }
        return new ArrayList<>(holdAnagramsMap.values());
    }
}
