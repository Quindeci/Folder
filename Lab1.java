<<<<<<< HEAD
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
            int c = 2;
            double res = 0;

            System.out.print("Введите a: ");
            short a = sc.nextShort();
            System.out.print("Введите n: ");
            int m = sc.nextInt();
            System.out.print("Введите b: ");
            short b = sc.nextShort();
            System.out.print("Введите m: ");
            int n = sc.nextInt();

            if ((a <= c)&&(c <= n)) {
                System.out.println("Деление на ноль ");
                System.exit(0);
            }

            for (short i = a; i <= n; i++) {
                for (short j = b; j <= m; j++) {
                    res += (i + j) / (double) (i - c);

                }
            }
            System.out.println(res);

        } catch (java.util.InputMismatchException e){
            System.out.println("Введите целое число!");
        }
    }
=======
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
            int c = 2;
            double res = 0;

            System.out.print("Введите a: ");
            short a = sc.nextShort();
            System.out.print("Введите n: ");
            int m = sc.nextInt();
            System.out.print("Введите b: ");
            short b = sc.nextShort();
            System.out.print("Введите m: ");
            int n = sc.nextInt();

            if ((a <= c)&&(c <= n)) {
                System.out.println("Деление на ноль ");
                System.exit(0);
            }

            for (short i = a; i <= n; i++) {
                for (short j = b; j <= m; j++) {
                    res += (i + j) / (double) (i - c);

                }
            }
            System.out.println(res);

        } catch (java.util.InputMismatchException e){
            System.out.println("Введите целое число!");
        }
    }
>>>>>>> 5475da8e9b27a9b6fb08490f523efff360575ee0
}