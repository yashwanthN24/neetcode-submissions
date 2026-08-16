class Solution {

    public String encode(List<String> strs) {
       return  strs.stream()
           .map(ele -> ele.length() +  "#" + ele)
           .collect(Collectors.joining());
    }

    public List<String> decode(String result) {
      List<String> finalRes = new ArrayList<>();
       int i = 0;
       while(i<result.length()){
            int length = 0;
            while(result.charAt(i)!='#'){
                length = length * 10 + (result.charAt(i)-'0');
                i++;
            }

            i++;
            String value = result.substring(i , i + length);

            // add to list 
            finalRes.add(value);

            // skip this length
            i = i + length;



       }

       return finalRes;

    }
}
