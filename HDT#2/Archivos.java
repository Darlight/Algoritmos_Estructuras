import java.io.*;

public class Archivos {

    public String leerTxt(String direccion){

        String texto = "";

        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead;
            }
            texto = temp;
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
        return texto;
    }
}
