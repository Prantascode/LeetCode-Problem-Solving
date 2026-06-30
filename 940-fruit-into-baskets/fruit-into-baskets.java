class Solution {
    public int totalFruit(int[] fruits) {
       int left = 0;
        int maxLength = 0;
        int length = 0;
        int baskets = 2;

        HashMap<Integer,Integer> freq = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            freq.put(fruits[right],freq.getOrDefault(fruits[right], 0) + 1);
            
            while (fruits[left] != fruits[right] && freq.size() > baskets) {
                freq.put(fruits[left], freq.get(fruits[left]) - 1);
                if (freq.get(fruits[left]) == 0) {
                    freq.remove(fruits[left]);
                }
                left++;
            }
            if (freq.size() <= baskets) {
                length = right - left + 1;
            }

            maxLength = Math.max(maxLength,length);
        }
        return maxLength;
    }
}