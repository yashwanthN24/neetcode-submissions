class Solution {
public:

    string encode(vector<string>& strs) {
        string ans = "";

        for (string &s : strs) {
            ans += to_string(s.length()) + "#" + s;
        }

        return ans;
    }

    vector<string> decode(string s) {

        vector<string> ans;

        int i = 0;

        while (i < s.length()) {

            string len = "";

            // Read length
            while (s[i] != '#') {
                len += s[i];
                i++;
            }

            int length = stoi(len);

            i++; // skip '#'

            // Read exactly 'length' characters
            string word = s.substr(i, length);

            ans.push_back(word);

            i += length;
        }

        return ans;
    }
};