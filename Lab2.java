<<<<<<< HEAD
import java.util.Random;
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // створюємо обєкт классу Scanner
        System.out.print("Введіть кількість рядків матриць: ");
        int m = sc.nextInt();
        System.out.print("Введіть кількість стовпців матриць: ");
        int n = sc.nextInt();


        int[][] matrix = new int[m][n];
        int[][] matrix1 = new int[m][n];
        int[][] result = new int[m][n];

        double sum = 0;

//заповнюэмо матрицю випадковими елементами
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomNumbers();

            }
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = randomNumbers();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] =  (byte)matrix[i][j] ^ (byte)matrix1[i][j];
            }
        }

        for (int i =0; i <result.length; i++){
            for(int j = 0; j <result[i].length; j++){
                sum += result[i][j]/(double)(m*n);
            }
        }

        System.out.println("Матриця А");
        showMatrix(matrix);
        System.out.println("Матриця B");
        showMatrix(matrix1);
        System.out.println("Матриця C");
        showMatrix(result);
        System.out.println("Середнє значення");
        System.out.println(sum);
    }
    // заполнение матриц
    public static int randomNumbers() {
        Random r = new Random();
        return r.nextInt(100);}
// вывод матриц
    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (String.valueOf(matrix[i][j]).length() < 2) {
                    System.out.print(" " + matrix[i][j] + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
=======
import java.util.Random;
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // створюємо обєкт классу Scanner
        System.out.print("Введіть кількість рядків матриць: ");
        int m = sc.nextInt();
        System.out.print("Введіть кількість стовпців матриць: ");
        int n = sc.nextInt();


        int[][] matrix = new int[m][n];
        int[][] matrix1 = new int[m][n];
        int[][] result = new int[m][n];

        double sum = 0;

//заповнюэмо матрицю випадковими елементами
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomNumbers();

            }
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = randomNumbers();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] =  (byte)matrix[i][j] ^ (byte)matrix1[i][j];
            }
        }

        for (int i =0; i <result.length; i++){
            for(int j = 0; j <result[i].length; j++){
                sum += result[i][j]/(double)(m*n);
            }
        }

        System.out.println("Матриця А");
        showMatrix(matrix);
        System.out.println("Матриця B");
        showMatrix(matrix1);
        System.out.println("Матриця C");
        showMatrix(result);
        System.out.println("Середнє значення");
        System.out.println(sum);
    }
    // заполнение матриц
    public static int randomNumbers() {
        Random r = new Random();
        return r.nextInt(100);}
// вывод матриц
    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (String.valueOf(matrix[i][j]).length() < 2) {
                    System.out.print(" " + matrix[i][j] + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
>>>>>>> 5475da8e9b27a9b6fb08490f523efff360575ee0
}