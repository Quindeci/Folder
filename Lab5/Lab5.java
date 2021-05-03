package lab5;

import java.util.Scanner;
public class Lab5  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = "Beautiful is better than ugly.\n" +
                "Explicit is better than implicit." + '\n'+
                "Simple is better than complex." + '\n'+
                "Complex is better than complicated." + '\n'+
                "Flat is better than nested." + '\n'+
                "Sparse is better than dense." + '\n'+
                "Readability counts."+ '\n' ;

        Text str = new Text(text);
        str.ObjSplit();
        System.out.print(text);
        try {
            System.out.print("Введіть довжину слова: ");
            int a = scan.nextInt();
            scan.nextLine();
            System.out.print("Введіть текст-заміну: ");
            String s = scan.nextLine();
            System.out.print("\n");
            str.myTask(a,s);

        }
        catch (java.util.InputMismatchException e){
            System.out.println("Введіть ціле число!");
        }


    }

}


