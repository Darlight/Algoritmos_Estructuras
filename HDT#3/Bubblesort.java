/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173
            Grupo: 12

Fecha: 07 de febrero de 2019
Proposito:
 */
public class BubbleSort implements Comparable{

    public int[] bubbleSort(Comparable[] numbers) {
        for (int i = 0; i < (numbers.length)-1; i++)
            for (int j = 0; j < (numbers.length-i)-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // reemplaza arr[j+1] y arr[i]
                    int temp = this.arr[j];
                    this.arr[j] = this.arr[j+1];
                    this.arr[j+1] = temp;
                }
        return; arr[];
    }
}