class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> holdsDuplicate = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            if(holdsDuplicate.containsKey(num)){
                return true;
            }
            holdsDuplicate.put(num, i);
        }
        return false;
    }
}