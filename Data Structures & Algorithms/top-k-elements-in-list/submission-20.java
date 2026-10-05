class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[]freqList = new List[nums.length + 1];
        Map<Integer , Integer> freqMap = new HashMap<>();

        for(int i = 0; i < freqList.length; i++){
            freqList[i] = new ArrayList<>();
        }

        for(Integer num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> eachItemInMap: freqMap.entrySet()){
            freqList[eachItemInMap.getValue()].add(eachItemInMap.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for(int i=freqList.length-1; i>0 && index < k; i--){
            for(Integer eachElement : freqList[i]){
                result[index] = eachElement;
                index++;
                if(index == k){
                    return result;
                }
            }
        }
        return result;
    }
}
