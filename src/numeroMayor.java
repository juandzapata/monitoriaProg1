import java.util.Scanner;

public class numeroMayor {
    public static void main(String[] args) throws Exception {        
        //Declaración de las variables, sin valor inicial y todas como número entero
        int a, b, c, d;

        //Creación del Scanner para recibir una entrada por consola
        Scanner entrada = new Scanner(System.in);

        //Ingreso del primer número
        System.out.print("\nIngrese el primer número: ");
        a = entrada.nextInt();
        //Ingreso del segundo número
        System.out.print("\nIngrese el segundo número: ");
        b = entrada.nextInt();
        //Ingreso del tercer número
        System.out.print("\nIngrese el tercer número: ");
        c = entrada.nextInt();
        //Ingreso del cuarto número
        System.out.print("\nIngrese el cuarto número: ");
        d = entrada.nextInt();
        
        System.out.println("\nEl número mayor es: " + numMayor(a, b, c, d));        
    }

    public static int numMayor(int a, int b, int c, int d){
        int numMayor = 0;
        
        if(a > numMayor){
            numMayor = a;
        }

        if(b > numMayor){
            numMayor = b;
        }

        if(c > numMayor){
            numMayor = c;
        }

        if(d > numMayor){
            numMayor = d;
        }
        return numMayor;
    }
}

