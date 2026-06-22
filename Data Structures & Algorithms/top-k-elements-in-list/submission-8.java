class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        //Convert to List and sort
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((a,b) -> Integer.compare(b.getValue(), a.getValue()));

        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}
