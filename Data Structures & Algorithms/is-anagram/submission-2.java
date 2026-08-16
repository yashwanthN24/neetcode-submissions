class Solution {
    public boolean isAnagram(String s, String t) {
        // Anargrams are of same length and contains the same set of character that make up two different meaningful words with the same set of characters 
        // if lengtht are not same return false
        if(s.length() != t.length()){
            return false;
        } 

        int count[] = new int[26];

        for(int i = 0 ; i<s.length(); i++){
            char  ch = s.charAt(i);
            count[ch-'a']++;
        }

        for(int i = 0 ; i<t.length(); i++){
            char  ch = t.charAt(i);
            count[ch-'a']--;
            if(count[ch-'a'] < 0){
                return false;
            }

        }

        return true ;

    }
}
