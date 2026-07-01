class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer>[] freqList = new List[nums.length+1];

        for(int i=0; i<freqList.length; i++){
            freqList[i] = new ArrayList<>();
        }

        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> mapItems: freqMap.entrySet()){
            freqList[mapItems.getValue()].add(mapItems.getKey());
        }

        int[] result = new int[k];
        int index = 0;

        for(int i=freqList.length-1; i>0&&index<k; i--){
            for(int n : freqList[i]){
                    result[index] = n;
                    index++;
                    if(index == k){
                        return result;
                    }
            }
        }
        return result;
    }
}
