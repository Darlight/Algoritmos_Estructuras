import java.util.*;
import java.io.*;

public class MainCalculadora {
    public static void main(String[] args){

        int resultado = 0;
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
            if ((lista[i] == "1")||(lista[i] == "2")||(lista[i] == "3")||(lista[i] == "4")){
                pila.push(Integer.parseInt(lista[i]));
            } else {
                num1 = pila.pop();
                num2 = pila.pop();
                pila.push(calculadora.Calculate(num1, num2, lista[i]));
            }
        }
    }
}
