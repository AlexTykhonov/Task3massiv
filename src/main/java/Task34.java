//4) Дан массив целых положительных чисел. Найти произведение
//только тех чисел, которые больше заданного числа М. Если таких нет, то выдать
//сообщение об этом.

import java.util.Scanner;

public class Task34 {

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        int[] massivInt = new int[5];
        Scanner in = new Scanner(System.in);
        int onecounter = 1;
        boolean was = false;


        //input
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число массива: ");
            massivInt[i] = in.nextInt();
        }

        // check for numbers exceeding the requested number division on 5
        System.out.println("Пожалуйста, введите граничное число, выберем всё, что больше этого:");
        int margin = in.nextInt();

        for (int j = 0; j < massivInt.length; j++) {
            if (massivInt[j]> margin) {onecounter=onecounter*massivInt[j];was=true;}
        }

        //results
        if (was) {
            System.out.println(ANSI_BLUE+"Произведение чисел превышающих "+margin+ " составляет: "+onecounter+".");
        } else System.out.println(ANSI_YELLOW+"В массиве не было числа превышающего "+margin+".");
    }
}
