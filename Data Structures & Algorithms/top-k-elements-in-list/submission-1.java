class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    //   List<Integer> kFrequent =  Arrays.stream(nums)
    //           .boxed()
    //           .collect(Collectors.groupingBy(
    //             val -> val, 
    //             Collectors.counting()
    //           ))
    //           .entrySet()
    //           .stream()
    //           .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
    //           .map(entry-> entry.getKey())
    //           .limit(k)
    //           .collect(Collectors.toList());

        
    //     int results[] = new int[k];
    //     int i = 0 ; 
    //     for(int a : kFrequent){
    //         results[i++] = a;
    //     }

    //     return results;


    // Frequency count
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        
        // Get all entries as array
        Map.Entry<Integer, Integer>[] entries = new Map.Entry[freq.size()];
        int idx = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            entries[idx++] = entry;
        }
        
        // Sort by frequency DESC
        Arrays.sort(entries, (a, b) -> Integer.compare(b.getValue(), a.getValue()));
        
        // Extract top k keys
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entries[i].getKey();
        }
        
        return result;
        
    }
}
