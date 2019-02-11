/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173
            Grupo: 12

Fecha: 07 de febrero de 2019
Proposito:
 */
 /*
   Extraido de: http://www.java2novice.com/java-sorting-algorithms/quick-sort/
   y mejorado en: https://codereview.stackexchange.com/questions/42750/quicksort-of-comparable
  */
import java.lang.*;
public class QuickSort{
    public static void sort(Comparable[] numbers) {
        quicksort(numbers, 0, numbers.length-1);
    }
    private static void quicksort(Comparable[] a, int lowerIndex, int maxIndex) {
        if(lowerIndex >= maxIndex){
            return;
        }
        //En este ciclo, se estara dividiendo los arrays
        int pivot = partition(a, lowerIndex, maxIndex);
        // se llama el quicksort() recursivamente, es decir, llama el metedo a si mismo
        //Hasta llegar un orden
        quicksort(a, lowerIndex, pivot-1);
        quicksort(a, pivot+1, maxIndex);
    }

    private static void exchange(Object[] a, int i, int j) {
        Object tmp = a[i];
        //Se intercambian los valores
        a[i] = a[j];
        a[j] = tmp;
    }
    private static int partition(Comparable[] a, int lowerIndex, int maxIndex) {
        //Int i es el indice inicial
        int i = lowerIndex + 1;
        //Int j es el indice maximo
        int j = maxIndex;

        while(i <= j) {
            /*
             * En cada iteracion, se busca un numero menor que el pivote en
             * el lado derecho y un numero mayor que el pivote en el lado
             * izquierdo. Hasta que se encuentre, se intercambiaran los numeros
             */
            if(a[i].compareTo(a[lowerIndex]) <= 0) {
                i++;
            }
            else if(a[j].compareTo(a[lowerIndex]) > 0) {
                j--;
            }
            else if(j < i) {
                break;
            }
            else
                //mueve el indice de ambos numeros en la siguiente posicion
                exchange(a, i, j);
        }
        exchange(a, lowerIndex, j);
        return j;
    }
}