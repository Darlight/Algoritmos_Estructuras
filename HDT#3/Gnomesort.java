/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173
            Grupo:

Fecha: 07 de febrero de 2019
Proposito:
 */
public class GnomeSort implements Comparable{
    public int[] gnomeSort(int[] arr) {
        int index = 0
        while (index < length) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = 0;
                temp = this.arr[index];
                this.arr[index] = this.arr[index - 1];
                this.arr[index - 1] = temp;
                index--;
            }
        }
        return arr[];
    }
}