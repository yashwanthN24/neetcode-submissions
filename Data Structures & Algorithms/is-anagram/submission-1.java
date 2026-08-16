class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        
        Map<Character,Integer> countMap = new HashMap<>();

        for(char c: s.toCharArray()){
            countMap.merge(c , 1 , (prev, curr)-> prev + curr);
        }

        for(char c: t.toCharArray()){

            if(countMap.containsKey(c)){
                countMap.put(c , countMap.get(c)-1);

                 if(countMap.get(c)== 0){
                countMap.remove(c);
                }
            }else{
                return false;
            }

           
        }

       return countMap.size() == 0;
    }
}
