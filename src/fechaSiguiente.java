import java.util.Scanner;

public class fechaSiguiente {
    public static void main(String[] args) throws Exception {

        String fecha = "24/10/2001";
        Scanner entrada = new Scanner(System.in);
        int dia;
        int mes;
        int año;

        do {
            System.out.print("\nIngrese la fecha con el formato (dd/mm/aaaa): ");
            fecha = entrada.next();
            String[] cadena = fecha.split("/");
            dia = Integer.parseInt(cadena[0]);
            mes = Integer.parseInt(cadena[1]);
            año = Integer.parseInt(cadena[2]);
        } while ((dia < 1 || dia > 31) || (mes < 0 || mes > 12));

        int meses30Dias[] = { 4, 6, 9, 11 };

        boolean ok = false;

        for (int m : meses30Dias) {
            // No se tiene en cuenta febrero, ni diciembre.
            if (mes == m) {
                if (dia == 30) {
                    dia = 1;
                    mes += 1;
                    ok = true;
                } else if (dia != 31) {
                    dia += 1;
                    ok = true;
                } else {
                    System.out.printf("El mes %d no tiene %d días", mes, dia);
                }
            }
        }

        if (!ok) {
            if (dia == 31) {
                if (mes != 12) {
                    dia = 1;
                    mes += 1;
                } else {
                    año += 1;
                    dia = 1;
                    mes = 1;
                }
            } else if (mes == 2) {// febrero
                // año bisiesto
                if (año % 4 == 0) {
                    if (dia == 29) {
                        dia = 1;
                        mes += 1;
                    } else {
                        dia += 1;
                    }
                } else if (dia == 28) {
                    dia = 1;
                    mes += 1;
                } else if (dia > 28) {
                    System.out.println("Error: febrero no tiene más de 28 días si el año no es bisiesto.");
                    return;
                    //throw new Exception("Error: febrero no tiene más de 28 días si el año no es bisiesto.");
                } else {
                    dia += 1;
                }
            } else {
                dia += 1;
            }
        }

        System.out.printf("%nEl día siguiente es: %d/%d/%d%n", dia, mes, año);
    }
}
