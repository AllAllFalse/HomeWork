package com.company;

public class Main {

    public static void main(String[] args) {

        int i = 3, i1, i2=1;
        if (i < 0) {
            System.out.print("1) Это отрицательное ");
            i = i * -1;
        } else {
            System.out.print("1) Это положительное ");
        }
        if (i<10) {
            System.out.println("однозначное число");
        } else {
            i1 = i;
            while (i1 > 10) {
                i1 = i1 / 10;
                i2++;
            }
            System.out.println(i2 + "значное число");
        }





        int a = 3, b = 4, c = 5;
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("2) Треугольник существует");
        } else {
            System.out.println("2) Треугольник не существует");
        }


        int e = 0;
        if (e > 0) {
            e++;
            System.out.println("3) e=" + e);
        } else {
            if (e < 0) {
                e = e - 2;
                System.out.println("3) e=" + e);
            } else {
                e = 10;
                System.out.println("3) e=" + e);
            }
        }


        int a1 = 4, a2 = -5, a3 = 6, q = 0;
        if (a1 > 0) {
            q++;
        } if (a2>0) {
            q++;
        } if (a3>0) {
            q++;
        }
        System.out.println("4) Положительных чисел "+q);


        int b1=7, b2=-8, b3=9, q1=0, q2=3;
        if (b1 > 0) {
            q1++;
            q2--;
        } if (b2>0) {
            q1++;
            q2--;
        } if (b3>0) {
            q1++;
            q2--;
        }
        System.out.println("5) Положительных чисел "+q1+" Отрицательных чисел "+q2);


        int c1=45, c2=45;
        if (c1>c2) {
            System.out.println("6) Большее число "+c1);
        } else {
            if (c1 == c2) {
                System.out.println("6) Числа равны");
            } else {
                System.out.println("6) Большее число " + c2);
            }
        }


        int p=51, p1;
        p1=p%10;
        if (p>4&&p<21) {
            System.out.printf("7) %d Программистов",p);
        } else {
            if (p1==1) {
                System.out.printf("7) %d Программист",p);
            } else {
                if (p1>1&&p1<5) {
                    System.out.printf("7) %d Программиста",p);
                } else {
                    System.out.printf("7) %d Программистов",p);
                }
            }

        }
    }
}

