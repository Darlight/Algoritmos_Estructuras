/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 01 de febrero de 2019
Proposito: Esta clase es la calculadora, esta implementa la interfaz
Calculator y se encarga basicamente de realizar los calculos.
 */

public class Calculadora implements Calculator{
    //Unico atributo de la clase
    private int resultado;

    //Override del metodo de la interfaz Calculator
    //Recibe como parametros dos valores int y un string
    //Los valores int son los numero entre los cuales se realizara
    //la operacion. Y el valor string es el operador
    public int Calculate(int num1, int num2, String op){
        //Condicion para cada caso
        if (op == "+"){
            //Si es +, entonces suma
            resultado = num1 + num2;
        } else if (op == "-"){
            //Si es -, entonces resta
            resultado = num1 - num2;
        } else if (op == "*"){
            //Si es *, entonces multiplica
            resultado = num1 * num2;
        } else if (op == "/"){
            //Si es /, entonces divide
            resultado = num1/num2;
        } else {
            //En caso de que no sea ninguno
            //Entonces se le asignara un 0
            resultado = 0;
        }
        //Devuelve el resultado
        return resultado;
    }
}
