package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //array1();
        //array2();
        //array3();
        //array4();
        //array5();
        //array6();
        //array7();
        //array8();
        //array9();
        //array10();
        arrayDop();
    }

    public static void array1() {
        System.out.println("1) Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] mass = new int [n];
        for (int i=0;i<mass.length;i++) {
            mass[i]=random.nextInt(10)*2+2;
        }
        for (int i=0;i<mass.length;i++) {
            System.out.print(mass[i]+" ");
        }
        System.out.println();
        for (int i=0;i<mass.length;i++) {
            System.out.println(mass[i]+"\n");
        }
    }

    public static void array2() {
        int numb = 1, i=0;
        int [] mass = new int [50];
        System.out.println("2)");
        for (i=0; i<mass.length;i++) {
            mass [i] = numb;
            numb+=2;
            System.out.print(mass[i]+" ");
        }
        System.out.println();
        for (--i; i>=0;i--) {
            System.out.print(mass[i]+" ");
        }
    }

    public static void array3() {
        System.out.print("3) ");
        int elements=0, s;
        Random random = new Random();
        int [] mass = new int [15];
        for (int i=0;i< mass.length;i++) {
            mass [i] = random.nextInt(100);
            System.out.print(mass[i]+" ");
            s=mass[i]%2;
            if (s==0) {
                elements++;
            }
        }
        System.out.println("\nЧётных элементов "+elements);
    }

    public static void array4 () {
        int s;
        Random random = new Random();
        System.out.println("4)");
        int [] mass = new int [15];
        for (int i=0;i< mass.length;i++) {
            mass[i] = random.nextInt(21);
            System.out.print(mass[i]+" ");
            s=mass[i]%2;
            if (s!=0) {
                mass [i]=0;
            }
        }
        System.out.println();
        for (int i=0;i< mass.length;i++) {
            System.out.print(mass[i]+" ");
        }
    }

    public static void array5() {
        float x=0f, y=0f;
        int mass1 [] = new int[5];
        int mass2 [] = new int[5];
        Random random = new Random();
        System.out.println("5) Первый массив");
        for (int i=0; i< mass1.length; i++) {
            mass1 [i] = random.nextInt(16);
            System.out.print(mass1[i]+" ");
            x+=mass1[i];
        }
        x/=5;
        System.out.println("\nВторой массив");
        for (int i=0; i< mass2.length; i++) {
            mass2 [i] = random.nextInt(16);
            System.out.print(mass2[i]+" ");
            y+=mass2[i];
        }
        y/=5;
        System.out.println("\nСреднее арифметическое первого массива "+x);
        System.out.println("Среднее арифметическое второго массива "+y);
        if (x<y) {
            System.out.println("Среднее арифметическое второго массива больше");
        } else {
            if (x>y) {
                System.out.println("Среднее арифметическое первого массива больше");
            } else {
                System.out.println("Средние арифметические равны");
            }
        }
    }

    public static void array6() {
        int s=0;
        System.out.println("6)");
        int [] mass = new int [4];
        Random random = new Random();
        for (int i=0;i< mass.length; i++) {
            mass[i] = random.nextInt(11);
            System.out.print(mass[i]+" ");
        }
        for (int i=1;i< mass.length;i++) {
            if (mass[i]>mass[i-1]) {
                s++;
            }
        }
        if (s==3) {
            System.out.print("\nМассив строго возрастающий");
        } else {
            System.out.print("\nМассив не строго возрастающий");
        }
    }

    public static void array7() {
        int [] mass = new int[12];
        Random random = new Random();
        int s=0;
        System.out.println("7)");
        for (int i=0; i<mass.length; i++) {
            mass [i] = random.nextInt(16);
            System.out.print(mass [i]+" ");
        }
        for (int i=1; i<mass.length; i++) {
            if (mass[s] <= mass [i-1]) {
            s = i-1;
            }
        }
        System.out.printf("\nМаксимальный элемент mass [%s] = %s",s,mass [s]);
    }

    public static void array8() {
        int [] mass1 = new int [10];
        int [] mass2 = new int [10];
        float [] mass3 = new float [10];
        Random random = new Random();
        System.out.println("8)");
        int s=0;
        for (int i=0; i< mass1.length; i++) {
            mass1 [i] = random.nextInt(10);
            mass2 [i] = random.nextInt(10);
            if (mass2 [i] !=0) {
                mass3 [i] = (float) mass1 [i]/mass2 [i];
                if (mass1[i]%mass2[i]==0) {
                    s++;
                }
            } else {
                continue;
            }
        }
        for (int i=0; i< mass1.length; i++) {
            System.out.print(mass1[i]+" ");
        }
        System.out.println();
        for (int i=0; i< mass2.length; i++) {
            System.out.print(mass2[i]+" ");
        }
        System.out.println();
        for (int i=0; i< mass3.length; i++) {
            System.out.print(mass3[i]+" ");
        }
        System.out.print("\nКоличество целочисленных элементов в третьей строке = "+s);
    }

    public static void array9() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n, s=0, t=0;
        System.out.println("9) Введите размер массива");
        do  {
            System.out.println("Введите положительное четное число");
            n = scanner.nextInt();
        } while (n%2!=0||n<=0);
        int [] mass = new int[n];
        for (int i=0;i< mass.length;i++) {
            mass [i] = random.nextInt(16);
            System.out.print(mass[i]+" ");
        }
        int g=n-1;
        for (int i=0; i< mass.length/2;i++) {
            s+=mass[i];
            t+=mass[g];
            g--;
        }
        if (s>t) {
            System.out.print("\nСумма элементов левой половины больше");
        } else {
            if (s < t) {
                System.out.print("\nСумма элементов правой половины больше");
            } else {
                System.out.print("\nСуммы элементов половин равны");
            }
        }
    }

    public static void array10() {
        System.out.println("10) Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int j=0;
        if (n<=3) {
            System.out.println("Размер должен быть больше 3");
            n = scanner.nextInt();
        }
        int [] mass1 = new int[n];
        for (int i=0; i< mass1.length; i++) {
            mass1 [i] = random.nextInt(n+1);
            System.out.print(mass1[i]+" ");
            if (mass1[i]%2==0) {
                j++;
            }
        }
        int [] mass2 = new int[j];
        j=0;
        for (int i=0; i< mass1.length; i++) {
            if (mass1[i]%2==0) {
                mass2[j] = mass1[i];
                j++;
            }
        }
        System.out.println();
        for (int i=0; i< mass2.length;i++) {
            System.out.print(mass2[i]+" ");
        }
    }

    public static void arrayDop() {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int [] mass = new int [n];
        int s=1, t=0;
        float f=0f;
        for (int i=0; i< mass.length; i++) {
            mass[i] = random.nextInt(10);
            System.out.print(mass[i]+" ");
            if (mass[i]%3==0 && mass[i]!=0) {
                s*=mass[i];
            }
        }
        System.out.print("\n1) Произведение элементов кратных 3 = "+s);
        for (int i=0; i< mass.length; i+=2) {
            f+=mass[i];
            t++;
        }
        if (t>0) {
            f = f / t;
        }
        System.out.print("\n2) Среднее арифметическое элементов с нечётными номерами = "+f);
        int C=4, q=0, w=0;
        for (int i=0; i< mass.length;i++) {
            if (mass[i]>C) {
                q+=mass[i];
                w++;
            }
        }
        if (w>0) {
            q /= w;
        }
        System.out.print("\n3) Среднее арифметическое элементов больших С = "+q);
        int r=mass[0];
        for (int i=1; i< mass.length;i++) {
            if (mass[i]%2!=0 && mass[i]<r) {
                r=mass[i];
            }
        }
        System.out.print("\n4) наименьший нечётный элемент = "+r);
        int [] mass1 = new int[n];
        System.out.print("\n5) ");
        for (int i=0; i< mass1.length;i++) {
            mass1 [i] = mass [i];
            if (i%2!=0) {
                mass1[i]=0;
            }
            System.out.print(mass1[i]+" ");
        }
        int u,z=1;
        for (int i=0; i< mass.length;i++) {
            u=mass[i];
            for (int j=i; j< mass.length-1;j++) {
                if (u==mass[j+1]) {
                    z=0;
                }
            }
        }
        if (z==1) {
            System.out.print("\n6) Все элементы различны");
        } else {
            System.out.print("\n6) Присутсвуют одинаковые элементы");
        }
        System.out.print("\n7) Введите число ");
        int x=0;
        int l = scanner.nextInt();
        for (int i=0; i< mass.length;i++) {
            if (l==mass[i]) {
                x++;
            }
        }
        if (x==0) {
            System.out.print("Элементы с заданным значением не встречаются");
        } else {
            System.out.printf("Элементы с заданным значением всречаются %s раз(а)",x);
        }
        int xy=0, yx=0;
        for (int i=0; i< mass.length;i++) {
            if (xy<mass[i]) {
                xy=mass[i];
            }
            if (yx<mass[i] && mass[i]<xy) {
                yx=mass[i];
            }
        }
        System.out.print("\n8) Второе по величине значение = "+yx);
        int xyz = mass[0];
        for (int i=0; i< mass.length;i+=2) {
            if (xyz>mass[i]) {
                xyz = mass[i];
            }
        }
        System.out.print("\n9) Наименьший элемент среди элементов с чётными индексами = "+xyz);
        int zyx=0, fer=mass[0], p=0;
        System.out.print("\n10) ");
        for (int i=0; i< mass.length;i++) {
            if (zyx<mass[i]) {
                zyx = mass [i];
                p=i;
            }
        }
        mass[0]=mass[p];
        mass[p]=fer;
        for (int i=0; i< mass.length;i++) {
            System.out.print(mass[i]+" ");
        }
    }




}
