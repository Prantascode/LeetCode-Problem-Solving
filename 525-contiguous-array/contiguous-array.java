class Solution {
    public int findMaxLength(int[] nums) {
        int prefix = 0;
        int maxLength = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefix += (nums[i] == 1) ? 1 : -1;

            if (map.containsKey(prefix)) {
                
                int length = i - map.get(prefix);

                maxLength = Math.max(maxLength, length);
            }
            else{
                map.put(prefix, i);
            }
        }
        return maxLength;
    }
}