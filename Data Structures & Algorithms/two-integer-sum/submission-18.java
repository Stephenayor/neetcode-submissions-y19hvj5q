class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> saveNumbersMap = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            int num = nums[i];
            int difference = target - num;
            if(saveNumbersMap.containsKey(difference)){
                return new int[]{saveNumbersMap.get(difference), i};
            }

            saveNumbersMap.put(num, i);
        }
        return new int[]{};
    }
}
