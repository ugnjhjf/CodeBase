import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int y = scanner.nextInt();
        Calendar date = Calendar.getInstance();
        date.set(2021, Calendar.MAY, 5, 8, 0, 0);
        date.add(Calendar.MINUTE, -10);
        date.add(Calendar.MINUTE, s % y == 0 ? -(s / y) : -(s / y) - 1);
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        System.out.println(format.format(date.getTime()));
    }
}
