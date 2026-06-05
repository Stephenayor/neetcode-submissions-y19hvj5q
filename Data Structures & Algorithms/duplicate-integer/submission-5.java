class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> checkForDuplicates = new HashMap<>();

        for(Integer num: nums){
            if(checkForDuplicates.containsKey(num)){
                return true;
            }
            checkForDuplicates.put(num, num);
        }
        return false;
    }
}