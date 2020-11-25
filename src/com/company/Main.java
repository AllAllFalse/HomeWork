package com.company;

public class Main {

    public static void main(String[] args) {
        Sport();
        Amoeba();
        Math();
        MT();
        Table();
        Number();
        Number2();
    }

    
    public static void Sport() {
        int j=1;
        float distance = 10.0f;
        for (int i=1;i<7;i++) {
            distance *= 1.1;
        }
        System.out.println("1) Суммарный путь "+distance);
    }


    public static void Amoeba() {
        int a=2, b=3;
        System.out.print("2)");
        for (;b<25;b+=3) {
            System.out.printf(" Время=%d  Амеб=%d *",b,a);
            a*=2;
        }
    }
    public static void Math () {
        int summa = 0;
        for (int i=1;i<257;i*=2) {
            summa+=i;
        }
        System.out.println("\n3) Сумма = "+summa);
    }


    public static void MT() {
        int A = -5, B = 8, c = 0;
        if (A<0&&B<0) {
            for (int i = 0; i > A; i--) {
                c -= B;
            }
        } else {
            if (A > 0) {
                for (int i = 0; i < A; i++) {
                    c += B;
                }
            } else {
                for (int i = 0; i > A; i--) {
                    c -= B;
                }
            }
        }
        System.out.println("4) Произведение = " + c);
    }


    public static void Table () {
        System.out.print("5) ");
        for (int i=1; i<21;i++) {
            float g=2.54f;
            g*=i;
            System.out.println("Дюймов = "+i+" Сантиметров = "+g);
        }
    }


    public static void Number () {
        System.out.print("6)");
        for (int i=2; i<101; i+=2) {
            System.out.println(" Число "+i);
        }
    }


    public static void Number2 () {
        int s=0;
        for (int i=1; i<100; i+=2) {
            s+=i;
        }
        System.out.println("7) Сумма = "+s);
    }
}
