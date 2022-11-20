import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) throws Exception {
        //Declaramos el primer número
        int num = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número:");
        num = entrada.nextInt();

        int resto, falta = num;
        int numeroInvertido = 0;

        while(falta>0){
            resto = falta % 10;
            falta /= 10; // equivalente -> falta = falta / 10;
            numeroInvertido = numeroInvertido * 10 + resto;
        }

        if(numeroInvertido == num){
            System.out.println("El número es capícua");
        }else{
            System.out.println("El número no es capícua");
        }

    }
}
