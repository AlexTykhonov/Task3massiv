//3)Дан массив натуральных чисел. Найти сумму элементов, кратных 5

import java.util.Scanner;

public class Task33 {
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

        // check exact division on 5

        for (int j = 0; j < massivInt.length; j++) {
            if (massivInt[j] % 5 == 0) onecounter++;
        }

        //show results

        System.out.println(" Массив: ");
        for (int ii = 0; ii < 5; ii++)
            System.out.print(ii + ": " + massivInt[ii] + "      ");

        switch (onecounter) {
            case 1:
                System.out.println(ANSI_BLUE + "В нашем массиве " + onecounter + " число,которое делятся на 5");
                break;
            case 2:
                System.out.println(ANSI_BLUE + "В нашем массиве " + onecounter + " числа,которые делятся на 5");
                break;
            case 3:
                System.out.println(ANSI_BLUE + "В нашем массиве " + onecounter + " числа,которые делятся на 5");
                break;
            case 4:
                System.out.println(ANSI_BLUE + "В нашем массиве " + onecounter + " числа,которые делятся на 5");
                break;
            case 5:
                System.out.println(ANSI_BLUE + "В нашем массиве " + onecounter + " чисел,которые делятся на 5");
                break;
            case 0:
                System.out.println(ANSI_BLUE + "В нашем массиве " + onecounter + " чисел,которые делятся на 5");
                break;

        }
    }
}
