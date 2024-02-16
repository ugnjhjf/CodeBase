// Accepted 2024年2月16日14:47:35

class Solution
{
public:
    int romanToInt(string s)
    {
        int sum = 0;
        bool I = false, V = false, X = false, L = false, C = false, D = false, M = false;

        for (int i = s.size() - 1; i >= 0; i--)
        {
            char c = s[i];
            switch (c)
            {
            case 'I':
                I = true;
                if (V == true || X == true)
                    sum -= 1;
                else
                    sum++;
                break;
            case 'V':
                V = true;
                sum += 5;
                break;
            case 'X':
                X = true;
                if (L == true || C == true)
                    sum -= 10;
                else
                    sum += 10;
                break;
            case 'L':
                L = true;
                sum += 50;
                break;
            case 'C':
                C = true;
                if (D != false || M != false)
                    sum -= 100;
                else
                    sum += 100;
                break;
            case 'D':
                D = true;
                sum += 500;
                break;
            case 'M':
                M = true;
                sum += 1000;
                break;
            }
        }
        return sum;
    }
};