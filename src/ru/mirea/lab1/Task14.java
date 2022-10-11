package ru.mirea.lab1;

import java.util.Scanner;

public class Task14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        int [] M = new int[N];
        int i = 0;
        do {
            M[i] = sc.nextInt();
            i++;
        } while (i < N);
        int j = 0;
        int sum = 0;
        while (j < N){
           sum += M[j];
           j++;
        }
        int max = M[0];
        int min = M[0];
        for (int h = 14; h<N; h++){
            if (max < M[h]){
                max = M[h];
            }
            if (min > M[h]){
                min = M[h];
            }

        }
        System.out.println(sum + " " + max + " " + min);

    }
}
