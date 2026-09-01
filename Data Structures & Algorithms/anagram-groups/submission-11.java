class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> holdAnagramsMap = new HashMap<>();

        for(String str: strs){
            int[] count = new int[26];
            for(char characterForEachString : str.toCharArray()){
                    count[characterForEachString - 'a']++;
            }
            String mapKey = Arrays.toString(count);
            holdAnagramsMap.putIfAbsent(mapKey, new ArrayList<>());
            holdAnagramsMap.get(mapKey).add(str);
        }

        return new ArrayList<>(holdAnagramsMap.values());
    }
}
