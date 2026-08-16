class Solution {
    public int longestConsecutive(int[] nums) {
        // put all elements in set 
        Set<Integer> uniqueElem = new HashSet<>();

        for(int i = 0 ; i<nums.length; i++){
            uniqueElem.add(nums[i]);
        }

        int maxLen = 0;
        for (int i = 0 ; i<nums.length ; i++){
            if(!uniqueElem.contains(nums[i]-1)){
                int count = 0; 
                while(uniqueElem.contains(nums[i] + count))
                    count++;
                maxLen = Math.max(count , maxLen);
            }
        }

        return maxLen;
    }
}
