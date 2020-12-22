package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;

        System.out.println(array[3]);

        String[] array1 = new String[3];
        array1[0] = "hello";
        array1[1] = "malika";
        array1[2] = "world";

         System.out.println(array[2]); //

        String[] array2 = {"hello", "world" , "apple"};
        System.out.println(array2[2]);//диманичная

        // циклы

        for (int i = 0; i <= 10; i++ ){
            System.out.println(i);
        }

        int counter = 0;
        while (counter < 5){
            System.out.println("Число равно:" + counter);
            counter++;
        }
        int  counter2 = 0;
        do {
            System.out.println("hello");
            counter2++;
        } while(counter2 <= 3);

        for (String value : array2) {
            System.out.println(value); // foreach
        }

        System.out.println("---------------");

        for (int i = 0; i <10; i++){
            System.out.println(i);
            if (i == 4) break;
        }

        System.out.println("-------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i >7 && i <9) continue; // 9
            System.out.println(i);

        }




    }
}
