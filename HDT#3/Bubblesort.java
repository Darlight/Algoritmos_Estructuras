/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173
            Grupo: 12

Fecha: 07 de febrero de 2019
Proposito:
 */
import java.util.*;
import java.io.*;
public class BubbleSort implements Comparable{

    public int[] bubbleSort(Comparable[] numbers) {
        for (int i = 0; i < numbers.length-1; i++)
            for (int j = 0; j < numbers.length-i-1; j++)
                if ((int)numbers[j] > (int)numbers[j+1])
                {
                    // reemplaza arr[j+1] y arr[i]
                    int temp = (int)numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
        return numbers[];
    }

    public void sort(Comparable[] numbers){
        if (numbers == null||numbers.length==0){
            return;
        }
        this.array = numbers;
        int length = numbers.length;
        quickSort(0, (numbers.length)-1);
    }
}