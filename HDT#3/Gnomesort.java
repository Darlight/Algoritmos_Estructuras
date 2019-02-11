/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173
            Grupo: 12

Fecha: 07 de febrero de 2019
Proposito:
 */
public class GnomeSort implements Comparable{
    public Comparable[] gnomeSort(Comparable[] numbers) {
        int index = 0;
        while (index < numbers.length) {
            if (index == 0)
                index++;
            if ((int)numbers[index] >= (int)numbers[index - 1]){
                index++;
            }else {
                Comparable temp = 0;
                temp = (int)numbers[index];
                numbers[index] = numbers[index - 1];
                (int)(numbers[index - 1]) = temp;
                index--;
            }
        }
        return this.numbers[];
    }
}