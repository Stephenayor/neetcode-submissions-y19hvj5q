class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
        anagramsMap.putIfAbsent(sortedString, new ArrayList<>());
        anagramsMap.get(sortedString).add(str);
        }
       
        return new ArrayList<>(anagramsMap.values());
    }
}
