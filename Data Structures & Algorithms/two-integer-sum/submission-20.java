class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> saveNumberMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int difference = target - num;
            if(saveNumberMap.containsKey(difference)){
                return new int[]{saveNumberMap.get(difference), i};
            }
            saveNumberMap.put(num, i);
        }
        return new int[]{};
    }
}
