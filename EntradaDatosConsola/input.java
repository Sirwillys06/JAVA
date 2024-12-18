package EntradaDatosConsola;

import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        

        Scanner entrada = new Scanner(System.in); //in es entrada estandar Input

        System.out.print("Escribe tu nombre: ");

        var nombre = entrada.nextLine();

        System.out.println("El nombre que ingresaste es: " + nombre);


    }

}
