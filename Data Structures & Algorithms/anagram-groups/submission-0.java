class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            res.computeIfAbsent(sortedS, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
