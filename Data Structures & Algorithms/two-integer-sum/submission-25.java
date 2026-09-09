class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> holdNumbers = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            int difference = target - num;

            if(holdNumbers.containsKey(difference)){
                return new int[]{holdNumbers.get(difference), i};
            }

            holdNumbers.put(num, i);
        }
        return new int[]{};
    }
}
