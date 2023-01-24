package lesson1;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //     ex1();
//        ex2();
        //homeWork3();
        //homeWork1();
        homeWork2();
    }

    private static void ex1() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!%n", name);
        iScanner.close();

    }

    private static void ex2() {
        int[] binaryArray = new int[1000];
        int counter = 0;
        int maxLength = 0;
        Random random = new Random();
//        double randomFromMath = Math.random();
//        System.out.println(randomFromMath);

        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = random.nextInt(2);
        }

//        System.out.println(Arrays.toString(binaryArray));

        for (int num : binaryArray) {
            if (num == 1) {
                counter++;
            } else {
                /*if (counter > maxLength) {
                    maxLength = counter;
                    counter = 0;
                }*/

                //(условие) ? true : false;
//                maxLength = (counter > maxLength) ? counter : maxLength;

                maxLength = Math.max(counter, maxLength);
                counter = 0;
            }
        }

        System.out.println("max length: " + Math.max(counter, maxLength));

    }

    private static void homeWork2() {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите год: ");
        int year = iScanner.nextInt();
        iScanner.close();
        if (year%4!=0){

            System.out.printf("Год не високосный");
        }
        else if (year%100==0) {
            if (year%400==0){
                System.out.printf("Год високосный");
            }
            else {
                System.out.printf("Год не високосный");
            }
            
        }
        else {
            System.out.printf("Год високосный");
        }



    }

    private static void homeWork3() {
        int number= 3;
        int[] Array = new int[10];
        Random random = new Random();
        for (int i = 0; i < Array.length; i++) {
            Array[i] = random.nextInt(5);

        }
        System.out.println(Arrays.toString(Array));
        for (int i = 0; i < Array.length; i++)
        {

            for (int j = i+1; j < Array.length; j++)
            {
                if(Array[i]==number && Array[j]!=number){

                    int temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;

                }

            }

        }
        System.out.println(Arrays.toString(Array));
    }



    private static void homeWork1() {
        int[] Array = new int[10];
        Random random = new Random();

        for (int i = 0; i < Array.length; i++) {
            Array[i] = random.nextInt(10);

        }
        System.out.println(Arrays.toString(Array));
            int max;
            int min;
            max = min = Array[0];
        for (int i = 0; i < Array.length; i++) {

                if(Array[i] > max) max = Array[i];
                if(Array[i] > max) max = Array[i];
            }


        System.out.println("Min: " +min);
        System.out.println("Max: " +max);

        }


    }








