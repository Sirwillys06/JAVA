
import java.util.Scanner;

public class LeerTiposDatos {

    public static void main(String[] args) {
        

        var escaner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        var edad = escaner.nextInt();

        System.out.print("Ingresa tu altura: ");
        var altura= escaner.nextDouble();

        escaner.nextLine(); 

        System.out.println("ingresa tu nombre: ");
        var nombre = escaner.nextLine();

        // conversion de datos:

        // convertir de string a entero

        System.out.print("Ingresa un numero: ");
        var numeroString= escaner.nextLine();
        var NumeroInt = Integer.parseInt(numeroString);

        System.out.println(NumeroInt);

        //Tipo double:

        System.out.print("ingresa tu altura: ");
        double var = Double.parseDouble(escaner.nextLine());















    }

}
