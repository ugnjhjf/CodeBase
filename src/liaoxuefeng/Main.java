// 一元二次方程
public class Main {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        // 求平方根可用 Math.sqrt():
        // System.out.println(Math.sqrt(2)); ==> 1.414
        // TODO:
        double r1 = 0;
        double r2 = 0;

        r1 =  ((-b) + Math.sqrt(b*b-(4*a*c))) / 2*a;
        r2 =  ((-b) - Math.sqrt(b*b-(4*a*c))) / 2*a;

        r1 = (int) (r1 + 0.5); // 四舍五入正数: +0.5 再转换
        r2 = (int) (r2 - 0.5); // 四舍五入负数: -0.5 再转换
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
    }
}
