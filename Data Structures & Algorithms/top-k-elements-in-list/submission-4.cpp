class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        vector<int> ans ; 

        map<int , int> mp;

        for(int i = 0 ; i<nums.size();i++){
            mp[nums[i]] += 1;
        }

        // bucket sorting placing them into buckets of max frequency which can be the array length itself if array size ifs 5 the max frequency of any element in that array can just be 5 not more than that 

        int bucketsize = nums.size()+1;
        vector<vector<int>> bucket(bucketsize) ;



        for(auto it: mp){
            bucket[it.second].push_back(it.first);
        }

        for(int i = nums.size(); i>=1 ; i--){
            for(int x: bucket[i]){
                ans.push_back(x); 

                if(ans.size() == k){
                    return ans;
                }
            }
        }

        return ans ;
    }
};
