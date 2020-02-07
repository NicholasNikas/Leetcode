import java.util.HashMap; // import the HashMap class

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Create Hash Map
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for (int i=0; i<nums.length; i++){
           int mapValue = (target-nums[i]);
            if (map.containsKey(mapValue)){
                int sum[] = {map.get(mapValue),i};
                return sum;
            } else {
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
