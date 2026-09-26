public class C237 {
    public static void main(String[] args){
        // Array define
        int[] ns = new int[5];
        ns[0] = 1;
        ns[1] = 2;
        ns[2] = 3;
        ns[3] = 4;

        System.out.println(ns.length);

        int[] ns = {1,2,3,4,5};

        // Change pointer
        int[] ns;
        ns = new int[] { 68, 79, 91, 85, 62 };
        System.out.println(ns.length); // 5
        ns = new int[] { 1, 2, 3 };
        System.out.println(ns.length); // 3
    }
}