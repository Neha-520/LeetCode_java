class Solution {
public:
    int minimumLength(string s) {
        vector<int> arr(26, 0);
        int len = s.size();
        for(int i = 0;  i < s.size(); i++) {
            arr[s[i]-'a']++;
        }
        for(int i = 0; i < arr.size(); i++) {
            if(arr[i] >= 3) {
                if(arr[i]%2 == 0) {
                    len -= arr[i]-2;
                }
                else {
                    len -= arr[i]-1;
                }   
            }
        }
        return len;
    }
};