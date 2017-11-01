package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.reverseString("Mera");

        String str = Main.reverseStringWithoutLoop("Tesla");
        System.out.println(str);

        main.totalCount("589");
        main.oddEven();
    }

    //Написать метод на вход которого передается строка. Метод должен вернуть перевернутую строку. Решение должно содержать цикл.
    public void reverseString(String text) {
        char [] reverse = text.toCharArray();

        for(int i = text.length()-1; i>=0; i--) {

            System.out.print(reverse[i]);
        }
        System.out.println("\n");
    }


     //Написать метод на вход которого передается строка. Метод должен вернуть перевернутую строку. Решение не должно содержать цикл.
     public static String reverseStringWithoutLoop(String str) {
            if (str.length() == 0)
                return "";
            return str.charAt(str.length() - 1) + reverseStringWithoutLoop(str.substring(0, str.length() - 1));

    }

    //Написать метод на вход которого передаются целое число. Метод должен вернуть сумму чисел составляющих число.
    public void totalCount(String numberText) {
        String y [] = numberText.split("");
        int sum = 0;
        for (int i=0;i<numberText.length();i++) {
            sum = sum + Integer.parseInt(y[i]);
        }
        System.out.println(sum);
    }

    //Написать метод на вход которого передается список целых чисел. Метод должен вернуть список четных чисел.
    public void oddEven() {
        ArrayList<Integer> lists = new ArrayList();
        Collections.addAll(lists, 1, 5, 6, 11, 3, 15, 7, 8);
        for(int list : lists) {
            if (list % 2 == 0) {
                System.out.print("Четный: " + list + " ");
            } else {
                System.out.print("Нечетный: " + list + " ");
            }
        }
    }


}
