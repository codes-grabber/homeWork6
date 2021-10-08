import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class homeWork6 {
    public static void main(String[] args) {
//        Cat firstcat = new Cat("Барсик", "Серый");
//        Cat secondcat = new Cat("Васька", "Черный");
//
//        System.out.println(firstcat.name + " " + firstcat.color);
//        System.out.println(secondcat.name + " " + secondcat.color);
//        firstcat.voice();
//        secondcat.voice();
//        firstcat.scream(secondcat.name);
//        Cat thirdcat = new Cat("Петька");
//        thirdcat.voice(5);
//        firstcat.voice(4);
        Nigger firstnigger = new Nigger("John Wick", "manager", "work@mail.ru", "89277570651", 54000, 30);
        firstnigger.PrintData();
        Nigger[] nigArray = new Nigger[5];
        nigArray[0]= new Nigger("John Wick", "manager", "work@mail.ru", "89277570651", 54000, 30);
        nigArray[1]= new Nigger("Ronald Withley", "manager", "work@mail.ru", "89277570651", 54000, 20);
        nigArray[2]= new Nigger("Garry Potter", "manager", "work@mail.ru", "89277570651", 54000, 15);
        nigArray[3]= new Nigger("Germiona Granger", "manager", "work@mail.ru", "89277570651", 54000, 38);
        nigArray[4]= new Nigger("Malfoi Drako", "manager", "work@mail.ru", "89277570651", 54000, 50);

        for (Nigger num: nigArray
             ) {
            if(num.age < 40){
                System.out.println(num.FNT);
            }
        }
//        //1
//        int[] x = GetMassive();
//
//        System.out.println(Arrays.toString(x));
//        System.out.println(Arrays.toString(InverceMassive(x)));
//        //2
//        subsequenceArray();
//        //3
//        int[] arr1 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
//        System.out.println(Arrays.toString(arr1));
//        DoubleSix(arr1);
//        //4
//
//
//
//    }
//    public static void DoubleSix(int[] arr){
//        int i = 0;
//        for (int num : arr){
//            if (num < 6)
//            {arr[i] = num*2;}
//            i++;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    public static int[] GetMassive(){
//        int[] arr = new int[10];
//        Random random = new Random();
//        for (int i=0; i<10; i++){
//            arr[i] = random.nextInt(2);
//        }
//        return arr;
//    }
//    public static int[] InverceMassive(int[] a){
//        int[] arr = new int[10];
//        for (int i = 0; i<10; i++){
//            arr[i] = 1 - a[i];
//        }
//        return arr;
//    }
//    public static void subsequenceArray() {
//        int[] arr = new int[100];
//
//        int i = 0;
//        for (int itVar : arr) {
//            arr[i] = i + 1;
//            i++;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
    }
}