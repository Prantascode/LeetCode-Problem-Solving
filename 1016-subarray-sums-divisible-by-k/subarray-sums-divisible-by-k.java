class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefix = 0;
        int reminder = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];

            reminder = (prefix % k + k) % k;

            if (map.containsKey(reminder)) {
                count += map.get(reminder);
            }

            map.put(reminder, map.getOrDefault(reminder, 0) +1);
        }
        return count;
    }
}