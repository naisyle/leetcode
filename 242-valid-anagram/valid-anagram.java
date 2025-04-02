class Solution {
    public boolean isAnagram(String s, String t) {
        // sort both strings (nlogn)
        // check if ordered char array are same 
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}