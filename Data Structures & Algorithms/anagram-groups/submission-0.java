class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // traverse each string 
        // for each string first sort and store in map 
        // with key as sorted string and value as original sring added to a list 

        Map<String , List<String>> anagramGroups = new HashMap<>();

        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            anagramGroups.computeIfAbsent(sortedStr , key -> new ArrayList<>() ).add(str);

        }

        return new ArrayList<>(anagramGroups.values());
    }
}
