class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for(String str : strs){
              int[] count = new int[26];
            for(char strCharacter: str.toCharArray()){
                count[strCharacter-'a']++;
               
            }
             String mapKey = Arrays.toString(count);
                anagramsMap.putIfAbsent(mapKey, new ArrayList<>());
                anagramsMap.get(mapKey).add(str);
        }
        return new ArrayList<>(anagramsMap.values());
    }
}
