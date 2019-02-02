/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 01 de febrero de 2019
Proposito: Esta clase se encarga de leer los archivos de texto,
pues el unico metodo que tiene es ese precisamente.
 */

//Se importan las librerias necesarias.
import java.io.*;

public class Archivos {

    //Metodo encargado de leer archivos de texto
    //Recibe como parametro la direccion en la que se encuentra
    //el archivo que se desea leer
    //Y nos devuelve el texto del archivo como un String
    public String leerTxt(String direccion){

        //Variable en la que se almacenara el texto leido
        String texto = "";

        //En caso de que no exista el archivo en esa direccion
        //Entonces se utiliza un try
        try{
            //Sinceramente, este pedazo de codigo fue visto en internet, pues
            //no se sabia como leer un archivo de texto, pero FUNCIONA
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead;
            }
            texto = temp;
        }catch(Exception e){
            //Si la direccion es incorrecta, entonces mostrara este mensaje
            System.err.println("No se encontro archivo");
        }
        //Devuelve el archivo leido o el mensaje de error
        return texto;
    }
}
