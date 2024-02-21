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