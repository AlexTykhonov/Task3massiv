//2) Переписать программу из предыдущего задания так, чтобы считалась сумма введенных числе

import java.util.Scanner;

public class Task32{

    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        int[] massivInt = new int[5];
        Scanner in = new Scanner(System.in);
        int onecounter = 0;


        //input
        for (int i = 0; i < 5; i++) {
            System.out.print("Input a number: ");
            massivInt[i] = in.nextInt();
        }

        // calculation of total amount

        for (int j = 0; j < massivInt.length; j++) {
            onecounter=onecounter+massivInt[j];
        }

        //show results
        System.out.println(" Массив: ");
        for (int ii = 0; ii < 5; ii++)
            System.out.print(ii + ": " + massivInt[ii] + "      ");
        System.out.println(ANSI_BLUE+"Сумма значений в массиве: " + onecounter);

    }
}
