//1) Написать программу, заводящую массив из 5 целых чисел, заполняющую
//его числами, введенными с клавиатуры, и печатающую, сколько раз в этом
//массиве встречается цифра 1.

import java.util.Scanner;

public class Task31 {

    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        int[] massivInt = new int[5];
        Scanner in = new Scanner(System.in);
        int onecounter = 0;
        String massivString = "";


        //input
        for (int i = 0; i < 5; i++) {
            System.out.print("Input a number: ");
            massivInt[i] = in.nextInt();
            massivString = massivString.concat(String.valueOf(massivInt[i]));
        }

        // calculation of 1 hits

        for (int j = 0; j < massivString.length(); j++) {
            if (Character.getNumericValue(massivString.charAt(j)) == 1) onecounter++;
        }

        //show results
        System.out.println(" Массив: ");
        for (int ii = 0; ii < 5; ii++)
            System.out.print(ii + ": " + massivInt[ii] + "      ");
        System.out.println(ANSI_BLUE + " Число единиц в массиве: " + onecounter);

    }
}
