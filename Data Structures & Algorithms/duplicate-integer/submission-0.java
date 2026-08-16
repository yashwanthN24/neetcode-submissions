
class Solution {
    public boolean hasDuplicate(int[] nums) {
    //    Map<Integer, Long> numCount =  Arrays.stream(nums)
    //                                     .collect(
    //                                         Collectors.groupingBy(
    //                                             Function.identity() 
    //                                             , Collectors.counting()
    //                                             )
    //                                             );

    //    long countOfNum = numCount.entrySet()
    //         .stream()
    //         .filter(entry -> entry.getValue() > 1)
    //         .count();

    //     if(countOfNum > 0 ){
    //         return true;
    //     }else{
    //         return false;
    //     }



        Map<Integer , Integer> numCount = new HashMap<>();

        for(int n: nums){
            numCount.merge(n , 1 , (prev , curr) -> prev + curr);
        }

        for(Map.Entry<Integer,Integer> entry: numCount.entrySet()){
            if(entry.getValue()> 1){
                return true;
            }
        }

        return false;
        
    }
}