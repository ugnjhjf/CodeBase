public class C236 {
    public static void main(String[] args) {
        char c1='6';
        char c2='中';
        char c3='\u0041';
        int n1 = 'A'; // 字母“A”的Unicode编码是65
        int n2 = '中'; // 汉字“中”的Unicode编码是20013

        String s1="\"abc\"" + c3;
        System.out.println(s1 );
        String s2="efg\\";
        String s3=s1 + " " + s2; // String支持直接用+拼接

        int i1=15;
        String s4=s3 + i1; // 其他数据类型跟String + 的时候会优先转成 String

        System.out.println(c3);


        // 请将下面一组int值视为字符的Unicode码，把它们拼成一个字符串：
        int a = 72;
        int b = 105;
        int c = 65281;

        String s = "" + (char) a + (char) b + (char) c;
//  以空字符串 "" 开头，强制第一个 + 为字符串拼接，这样后续的所有 + 也会被解释为字符串拼接，最终将每个 char 转换为对应的字符并连接成一个字符串。//
//  如果不加 ""，直接写 (char) a + (char) b + (char) c，那么会先做两次数值加法（char 自动提升为 int），得到的是一个整数（72 + 105 + 65281 = 65458），而不是字符串，且无法赋值给 String 类型，导致编译错误。
        System.out.println(s);

    }
}
