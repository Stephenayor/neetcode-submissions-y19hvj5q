class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> containsDuplicate = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
                if(containsDuplicate.containsKey(num)){
                    return true;
                }
            containsDuplicate.put(num, i);
        }
        return false;
    }
}