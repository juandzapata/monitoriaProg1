import java.util.ArrayList;
import java.util.Scanner;

public class pruebas {    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        //Declaración de variables
        ArrayList<String> datosArrayList = new ArrayList<String>();
        ArrayList<String> datos2ArrayList = new ArrayList<String>();
        String nuevaLinea = "";
        Boolean condicion = false;
        String fecha1 = "";
        String fecha2 = "";
        String dato1 = "";
        String dato2 = "";
        String lineaConvertida = "";
        
        while(!condicion){
            nuevaLinea = entrada.nextLine();
            if(nuevaLinea.equals("/")){
                condicion = true;
            }else{                
                datosArrayList.add(nuevaLinea);           
            }
        }
         
        //INSERT INTO CertificacionXFinca VALUES('0001','000000018F','11/02/2020','07/09/2023');
        for(int i = 0; i< datosArrayList.size(); i++){
            fecha1 = convertirFecha(datosArrayList.get(i).substring(60,70));
            fecha2 = convertirFecha(datosArrayList.get(i).substring(73,83));
            dato1 = datosArrayList.get(i).substring(40,44);
            dato2 = datosArrayList.get(i).substring(47,57);
            lineaConvertida = "INSERT INTO CertificacionXFinca VALUES('"+dato1+"','"+dato2+"','"+fecha1+"','"+fecha2+"');";
            datos2ArrayList.add(lineaConvertida);
        }
        
        for(int i = 0; i < datos2ArrayList.size(); i++){
            System.out.println(datos2ArrayList.get(i));
        }
    }

    public static String convertirFecha(String fecha){
        String fechaConvert = "";
        String fechaArray[] = fecha.split("/");
        fechaConvert = fechaArray[2] + fechaArray[0] + fechaArray[1];
        return fechaConvert;
    }

}
