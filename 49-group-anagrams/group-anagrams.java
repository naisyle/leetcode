class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap of key,value (sorted String, list of anagram words)
        // (aet: eat, tea, ate)
        // sort the word 
        // check if sorted word absent from hashmap 
        // add the word to the key(sorted string)
        // return each list of values
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        for (String word : strs) {
            char[] sortedChars = word.toCharArray();
            Arrays.sort(sortedChars);
            String sortedKey = new String(sortedChars);
            
            anagramMap.putIfAbsent(sortedKey, new ArrayList<>());
            anagramMap.get(sortedKey).add(word);
        }
        return new ArrayList<>(anagramMap.values());
    }
}