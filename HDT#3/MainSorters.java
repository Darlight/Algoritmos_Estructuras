import java.util.*;

public class MainSorters {
    public static void main(String[] args){

        int limite;
        int numero;
        String texto;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros que desea crear");
        limite = scan.nextInt();
        int[] lista = new int[limite];
        Archivos archivo2 = new Archivos();

        for (int i = 0; i<limite; i++){
            numero = (int) (Math.random() * limite);
            while(lista[numero] != 0){
                numero = (int) (Math.random() * limite);
            }
            lista[numero] = i;
        }

        Formatter archivo = null;

        try{
            archivo = new Formatter("C:\\Users\\josue\\Desktop\\Archivo.txt");
            for (int i = 0; i<lista.length; i++) {
                archivo.format("%d %s", lista[i], "\n");
            }
        }catch(Exception e){
            System.out.println("Ha ocurrido un error: " + e.toString());
        }finally {
            archivo.close();
        }

        texto = archivo2.leerTxt("C:\\Users\\josue\\Desktop\\Archivo.txt");
        String[] lista2 = texto.split(" ");
        for (int i = 0; i<lista2.length;i++){
            System.out.println(lista2[i]);
        }
    }
}