package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер матрицы ");
        int n = scanner.nextInt();
        int [][] matrix = new int [n][n];
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix.length; j++) {
                matrix[i][j] = random.nextInt(51);
            }
        }
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
//1) Почитать сумму четных элементов стоящих на главной диагонали.
        System.out.print("1) ");
        int v=0;
        for (int i=0; i< matrix.length; i++) {
            if (matrix[i][i]%2==0) {
                v++;
            }
        }
        System.out.println("Количество чётных элементов на главной диагонали = "+v);
//2)Вывести нечетные элементы находящиеся под главной
//диагональю(включительно).
        System.out.print("2) ");
        int x=0;
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j<=i; j++) {
                if (matrix[i][j]%2!=0) {
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
//3)Проверить произведение элементов какой диагонали больше.
        System.out.print("\n3) ");
        int f=1, g=1;
        for (int i=0; i< matrix.length; i++) {
            f*=matrix[i][i];
        }
        for (int i=0; i< matrix.length; i++) {
                g*=matrix[i][n-i-1];
        }
        if (f>g) {
            System.out.println("Произведение главной диагонали больше");
        } else {
            if (f<g) {
                System.out.println("Произведение побочной диагонали больше");
            } else {
                System.out.println("Приоизведения диагоналей равны");
            }
        }
//4)Посчитать сумму четных элементов стоящих над побочной диагональю (не
//включительно)
        System.out.print("4) ");
        int q=0;
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                if (j< matrix[j].length-1-i) {
                    if (matrix[i][j]%2==0) {
                        q+=matrix[i][j];
                    }
                }
            }
        }
        System.out.println("Сумма чётных элементов над побочной диагональю = "+q);
//5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
//строкой и т. д.)
        System.out.println("5) Транспонированная матрица");
        for (int i=0; i< matrix.length; i++) {
            for (int j=i+1; j< matrix.length; j++) {
                int w = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=w;
            }
        }
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix.length; j++) {
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
/*Крестики-нолики
Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока. Они
по очереди вводят координаты клетки в которую хотят сделать ход. После
каждого хода, в консоли отрисовывается игровое поле с текущим состоянием.
Игра продолжается до победы одного из игроков или ничьи.*/
        System.out.println("Крестики-нолики");
        String [][] array = new String [3][3];
        int [][] array2 = new int [3][3];
        Random random1 = new Random();
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        for (int i=0; i< array.length; i++) {
            for (int j=0; j< array.length; j++) {
                array[i][j]=" ";
                array2[i][j]= random1.nextInt(500)+10;
            }
        }
        for (int y=0; y<9; y++) {
            System.out.println("Введи строку");
            int i = scanner1.nextInt();
            System.out.println("Введи столбец");
            int j = scanner2.nextInt();
            if (i > 3 || i < 1 || j > 3 || j < 1) {
                System.out.println("Неправильный ввод");
                return;
            }
            if (y%2==0) {
                array[i-1][j-1] = "X";
                array2[i-1][j-1] = 1;
            } else {
                array[i-1][j-1] = "O";
                array2[i-1][j-1] = 2;
            }
            for (int k=0; k< array.length; k++) {
                for (int l=0; l< array.length; l++) {
                    System.out.print(array[k][l]+"|");
                }
                System.out.println();
            }
            if (array2[0][0] == array2[0][1] && array2[0][0] == array2[0][2] ||
            array2[1][0] == array2[1][1] && array2[1][1] == array2[1][2] ||
            array2[2][0] == array2[2][1] && array2[2][2] == array2[2][1] ||
            array2[0][0] == array2[1][0] && array2[0][0] == array2[2][0] ||
            array2[0][1] == array2[1][1] && array2[0][1] == array2[2][1] ||
            array2[0][2] == array2[1][2] && array2[0][2] == array2[2][2] ||
            array2[0][0] == array2[1][1] && array2[0][0] == array2[2][2] ||
            array2[0][2] == array2[1][1] && array2[1][1] == array2[2][0]) {
                System.out.println("Конец игры");
                break;
            }

        }



    }
}
