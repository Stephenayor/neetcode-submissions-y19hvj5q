class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> holdingMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int difference = target - num;
           
                if(holdingMap.containsKey(difference)){
                    return new int[]{holdingMap.get(difference), i};
                }
            holdingMap.put(num, i);
        }
        return new int[]{};
    }
}
