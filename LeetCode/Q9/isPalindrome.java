class Solution {
    public boolean isPalindrome(int x) {
        String s1=String.valueOf(x);
        String s2="";

        for(int i=s1.length()-1;i>=0;i--)
        {
            s2 = s2 + s1.charAt(i);
        }
        return s1.equals(s2);

        // for(int j=0;j<s1.length();j++){
        //     if(s1.charAt(j)!=s2.charAt(j)) return false;
        // }
        // return true;
    }

    // CHATGPT class Solution {
    //     public boolean isPalindrome(int x) {
    //         String s1 = String.valueOf(x);
    //         String s2 = "";
            
    //         // 正确遍历s1字符串以构建s2
    //         for(int i = s1.length() - 1; i >= 0; i--) {
    //             s2 = s2 + s1.charAt(i);
    //         }
            
    //         // 比较所有字符
    //         for(int j = 0; j < s1.length(); j++) {
    //             if(s1.charAt(j) != s2.charAt(j)) return false;
    //         }
    //         return true;
    //     }
    }
    
