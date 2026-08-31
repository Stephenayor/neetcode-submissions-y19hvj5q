class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> holdsDifference = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int difference = target - num;

            if(holdsDifference.containsKey(difference)){
                return new int[]{holdsDifference.get(difference), i};
            }

            holdsDifference.put(num, i);
        }
        return new int[]{};
    }
}
