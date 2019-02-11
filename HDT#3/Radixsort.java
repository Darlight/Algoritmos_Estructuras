/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173
            Grupo: 12

Fecha: 07 de febrero de 2019
Proposito:
 */
 /*
        Extraido de: https://www.geeksforgeeks.org/radix-sort/
         creado por el autor Devesh Agrawal
         */
import java.lang.*;
public class RadixSort{
    // A utility function to get maximum value in arr[]
    // The main function to that sorts arr[] of size n using
    // Radix Sort
    static void radixsort(Comparable[] numbers, int n)
    {
        // Find the maximum number to know number of digits
        int m = getMax(numbers, n);

        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; m/exp > 0; exp *= 10)
            countSort(numbers, n, exp);
    }
    static int getMax(Comparable[] numbers, int n)
    {
        int mx = numbers[0];
        for (int i = 1; i < n; i++)
            if (numbers[i].compareTo(mx) > 0)
                mx = numbers[i];
        return mx;
    }

    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(Comparable[] numbers, int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[ (numbers[i]/exp)%10 ]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (i = n - 1; i >= 0; i--)
        {
            output[count[ (numbers[i]/exp)%10 ] - 1] = numbers[i];
            count[ (numbers[i]/exp)%10 ]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (i = 0; i < n; i++)
            numbers[i] = output[i];
    }


}
