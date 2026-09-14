class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();
        for(String str: strs){
              char[] charArray = str.toCharArray();
                Arrays.sort(charArray);
                String anagramsKey = new String(charArray);
                anagramsMap.putIfAbsent(anagramsKey, new ArrayList<>());
                anagramsMap.get(anagramsKey).add(str);
        }
        return new ArrayList<>(anagramsMap.values());
    }
}
