class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)) sb.append(Character.toLowerCase(c));  // ✅ FIXED
        }
        String clean = sb.toString();
        int l=0, r=clean.length()-1;
        while(l<r){
            if(clean.charAt(l++) != clean.charAt(r--)) return false;
        }
        return true;
    }
}
