import javax.swing.*;
import java.util.*;
import java.io.*;

public class MainCalculadora {
    public static void main(String[] args){

        int num1, num2;
        String op;
        String nombreArchivo, texto;

        Calculadora calculadora = new Calculadora();
        StackArrayList<Integer> pila = new StackArrayList<>();
        Archivos archivo = new Archivos();
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la direccion del archivo: ");
        //C:\Users\josue\Desktop\prueba\prueba.txt
        //Si aqui lee el archivo de texto
        nombreArchivo = scan.nextLine();
        // Fijo tendra mas de 1 linea entonces
        // Hay que hacer un arraylist de String aqui y por cada linea del texto
        // se gaurdada en cada celda de la lista
        //Aqui iria el for creo
        texto = archivo.leerTxt(nombreArchivo);
        //Como Aqui
        String[] lista = texto.split(" ");
        //F
        for (int j = 0; j < lista[j]; j++){
            for (int i = 0; i < lista[j].length; i++){
                if (lista[i].equals("+")){
                    pila.push(calculadora.Calculate(pila.pop(), pila.pop(), "+"));
                } else if (lista[i].equals("-")){
                    pila.push(calculadora.Calculate(pila.pop(), pila.pop(), "-"));
                } else if (lista[i].equals("*")){
                    pila.push(calculadora.Calculate(pila.pop(), pila.pop(), "*"));
                }else if (lista[i].equals("/")){
                    pila.push(calculadora.Calculate(pila.pop(), pila.pop(), "/"));
                } else {
                    pila.push(Integer.parseInt(lista[i]));
                }
                System.out.println("El resultado es: " + pila.pop());
            }
        }




    }
}
