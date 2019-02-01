import java.util.*;
import java.io.*;

public class MainCalculadora {
    public static void main(String[] args){

        int resultado = 0;
        int num1, num2;
        String op;
        String nombreArchivo, texto;

        Calculadora calculadora = new Calculadora();
        Stack<Integer> stack = new Stack<>();


        Archivos archivo = new Archivos();
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la direccion del archivo: ");
        //C:\Users\josue\Desktop\prueba\prueba.txt
        nombreArchivo = scan.nextLine();

        texto = archivo.leerTxt(nombreArchivo);
        String[] lista = texto.split(" ");

        for (int i = 0; i < lista.length; i++){
            System.out.println("Hola");
        }
        /*
        for (int i = 0; i < lista.length; i++){

            if ((texto.substring(i, i+1) == "1")||(texto.substring(i, i+1) == "2")||(texto.substring(i, i+1) == "3")||(texto.substring(i, i+1) == "4")
                    ||(texto.substring(i, i+1) == "5")||(texto.substring(i, i+1) == "6")||(texto.substring(i, i+1) == "7")||(texto.substring(i, i+1) == "8")
                    ||(texto.substring(i, i+1) == "9")||(texto.substring(i, i+1) == "0")){

                stack.push(Integer.parseInt(texto.substring(i, i+1)));

            } else if ((texto.substring(i, i+1) == "+")||(texto.substring(i, i+1) == "-")||(texto.substring(i, i+1) == "*")||(texto.substring(i, i+1) == "/")){
                num1 = stack.peek();
                stack.pop();
                num2 = stack.peek();
                stack.pop();
                resultado = calculadora.Calculate(num1, num2, texto.substring(i, i+1));
                stack.push(resultado);
            }

        }

        System.out.println(stack.peek());
        */


    }
}
