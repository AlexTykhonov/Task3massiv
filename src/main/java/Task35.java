//Pascal 10 level massive generation
public class Task35 {
    public static void main(String[] args) {

        int[][] massivInt = new int[10][10];

        // заполним массив нулями
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                massivInt[i][j] = 0;
            }
        }

        // рамка треугольника состоит из единиц, заполним ее единицами

        for (int ii = 0; ii < 10; ii++) {
            massivInt[ii][ii] = 1;
            massivInt[0][ii] = 1;
        }

        // проверим что у нас получается
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(massivInt[j][i]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        // заполним матрицу
        for (int s=2;s<10;s++) {
            for (int c=1;c<s;c++) {
                massivInt[c][s] = massivInt[c-1][s-1]+massivInt[c][s-1];
            }
        }

        // проверим что у нас получается в результате
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(massivInt[j][i]+" ");
            }
            System.out.println();
        }

    }


}


