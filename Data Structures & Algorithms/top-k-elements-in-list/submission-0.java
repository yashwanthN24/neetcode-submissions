class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      List<Integer> kFrequent =  Arrays.stream(nums)
              .boxed()
              .collect(Collectors.groupingBy(
                val -> val, 
                Collectors.counting()
              ))
              .entrySet()
              .stream()
              .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
              .map(entry-> entry.getKey())
              .limit(k)
              .collect(Collectors.toList());

        
        int results[] = new int[k];
        int i = 0 ; 
        for(int a : kFrequent){
            results[i++] = a;
        }

        return results;
        
    }
}
