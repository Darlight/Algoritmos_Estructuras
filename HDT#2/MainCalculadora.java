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
        nombreArchivo = scan.nextLine();

        texto = archivo.leerTxt(nombreArchivo);
        String[] lista = texto.split(" ");

        for (int i = 0; i < lista.length; i++){
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
        }

        System.out.println("El resultado es: " + pila.pop());

    }
}
