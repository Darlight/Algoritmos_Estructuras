/*
Mario Perdomo 18029
Josue Sagastume 18173
 */
import java.util.*;
import java.io.*;

public class Calculadora implements Calculator{

    private int resultado;

    //Override
    public int Calculate(int num1, int num2, String op){
        if (op == "+"){
            resultado = num1 + num2;
        } else if (op == "-"){
            resultado = num1 - num2;
        } else if (op == "*"){
            resultado = num1 * num2;
        } else if (op == "/"){
            resultado = num1/num2;
        } else {
            resultado = 0;
        }
        return resultado;
    }

}
