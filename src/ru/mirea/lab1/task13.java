package ru.mirea.lab1;

public class task13 {
    public static void main(String[]args){
        int [] M = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        double avg = 0.0;
        for (int i=0; i<10; i++){
            sum += M[i];
        }
        avg = sum * 1.0 / 10;
        System.out.print("сумма массива = "+ sum + "\n" + "среднее значение =" + avg);

    }
}
