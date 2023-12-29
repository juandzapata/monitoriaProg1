import java.util.ArrayList;
import java.util.Scanner;

public class cambiarFormatoFecha {
    public static void main(String[] args) throws Exception {        
        

        //Creación del Scanner para recibir una entrada por consola
        Scanner entrada = new Scanner(System.in);        

        //Declaración de variables
        ArrayList<String> datosArrayList = new ArrayList<String>();
        String nuevaLinea = "";
        Boolean condicion = false;
        int i = 0;
        
        while(!condicion){

            if(datosArrayList.get(i).equals("/")){
                condicion = true;
            }else{
                nuevaLinea = entrada.nextLine();
                datosArrayList.add(nuevaLinea);           
            }

            i++;
        }
        entrada.close();
    }

    public static String convertirFecha(String fecha){
        String fechaConvert = "";
        String fechaArray[] = fecha.split("/");
        fechaConvert = fechaArray[2] + fechaArray[0] + fechaArray[1];
        return fechaConvert;
    }
}

