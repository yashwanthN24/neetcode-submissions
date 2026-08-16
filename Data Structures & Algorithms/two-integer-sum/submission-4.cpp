class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> ans; 

        unordered_map<int , int> mp;

        for(int i = 0 ;i<nums.size(); i++){
            int difference = target - nums[i];
            if(mp.contains(difference)){
                ans.push_back(mp[difference]);
                ans.push_back(i);
                return ans;
            }            
            mp[nums[i]] = i;

        }
        return ans;
    }
};
