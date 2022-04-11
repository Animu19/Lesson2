package Lesson2;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args){
        PrintAndInWork1();//Задание1
        InWork2();//Задание2
        InWork3();//Задание3
        InWork4();//Задание4
    }
    public static  boolean work1(int a, int b){      //Можно было конечно и через for сравнивать каждое число от 10 до 20 с суммой а и b
        if (a+b>=10){
            if (a+b<=20){
                return true;
            }
            else {
                return false;
            }
        }
            else {
            return false;
        }


    }
    public static void PrintAndInWork1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Урок2. Задание1");
        System.out.print("Введите число а:=");
        int a=scanner.nextInt();
        System.out.print("Введите число b:=");
        int b=scanner.nextInt();

        System.out.println("Ответ:"+work1(a,b));
    }
    public static void Work2(int c){
        if (c>=0){
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
    public static void InWork2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Урок2. Задание2");
        System.out.print("Введите число c:=");
        int c=scanner.nextInt();
        Work2(c);

    }
    public static boolean Work3(int d){
        if (d>=0){
            System.out.println("Число положительное");
            return false;
        }
        else {
            System.out.println("Число отрицательное");
            return true;
        }
    }
    public static void InWork3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Урок2. Задание3");
        System.out.print("Введите число c:=");
        int d=scanner.nextInt();

        System.out.println("Ответ:"+Work3(d));

    }
    public static void Work4(String f,int k){
        for (int i=0; i<k;i++){
            System.out.println(f);
        }

    }
    public static void InWork4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Урок2. Задание4");
        System.out.print("Введите текст:=");
        String f=scanner.nextLine();
        System.out.print("Введите количество повторов:=");
        int k=scanner.nextInt();
        Work4(f,k);

    }
    

}

