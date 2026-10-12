class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            int difference = target - num;
            if(freqMap.containsKey(difference)){
                return new int[]{freqMap.get(difference), i};
            }

            freqMap.put(num, i);
        }
        return new int[]{};
    }
}
