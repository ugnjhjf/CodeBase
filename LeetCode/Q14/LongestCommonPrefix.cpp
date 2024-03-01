#include <stdio.h>
#include <iostream>
#include <vector>
#include <algorithm>
#include <cstring>
using namespace std;
class Solution
{
public:
    string longestCommonPrefix(vector<string> &strs)
    {
        int num = strs.size();
        string ans = "";
        for (int i = 0; i < num - 1; i++)
        {
            if (strs[i].length() != strs[i + 1].length())
                return "";
        }
        for (int j = 0; j < num; j++)
            for (int k = 0; k < num; k++)
            {
                if (strs[k][j] == strs[k + 1][j])
                    ans = ans + strs[k];
            }
        return ans;
    }
};

int main()
{
    vector<string> strs = {"flower", "flow", "flight"};
    Solution s1 = new Solution(strs);
    cout << s1.longestCommonPrefix(strs) << endl;
}