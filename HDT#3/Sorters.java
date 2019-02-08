/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 07 de febrero de 2019
Proposito:
 */
public class Sorters implements Comparable{
    /*
    En esta clase, sugiero yo que colocamos estos 3 atributos, ya que cada
    sort los necesita.
    El array con los 3000 numeros, un array temporal que basicamente lo usa para colocar
    los numeros ya ordenados y reemplazarlo en el array original y el tamanio del array de enteros
     */
    private int[] array;
    private int[] tempArray;
    private int length;
    // A function to implement bubble sort
    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < length-1; i++)
            for (int j = 0; j < length-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // reemplaza arr[j+1] y arr[i]
                    int temp = this.arr[j];
                    this.arr[j] = this.arr[j+1];
                    this.arr[j+1] = temp;
                }
        return; arr[];
    }
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
    private void mergeSort(int[] arr) {

        if (arr[0] <) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            mergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            mergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
}