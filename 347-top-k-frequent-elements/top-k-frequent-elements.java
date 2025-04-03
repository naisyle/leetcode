class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // create a frequency HashMap of key(=num in nums), value(=frequency)
        // sort map by value in descending order 
        // put the k first elements of sorted map into an arrayList 
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int i : nums) {
            freq.putIfAbsent(i, 1);
            int curr = freq.get(i);
            freq.put(i, curr+1);
        }
        Map<Integer, Integer> sortedFreq = sortMapByValueDescending(freq);
        int[] out = sortedFreq.keySet().stream().limit(k).mapToInt(Integer::intValue).toArray();
        return out;
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortMapByValueDescending(Map<K, V> map) {
    return map.entrySet()
      .stream()
      .sorted(Map.Entry.<K, V>comparingByValue().reversed())
      .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}