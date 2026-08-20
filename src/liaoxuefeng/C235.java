public class C235 {
    public static void main(String[] args) {
        int age = 7;
        // primary student的定义: 6~12岁
        boolean isPrimaryStudent = (age <= 12 && age >=6) ? true : false;
        // 更好的写法
//        boolean isPrimaryStudent = (age <= 12 && age >=6) ;
        System.out.println(isPrimaryStudent ? "Yes" : "No");
    }
}
