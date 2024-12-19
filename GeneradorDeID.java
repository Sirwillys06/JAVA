import java.util.Random;
import java.util.Scanner;

public class GeneradorDeID {

    public static void main(String[] args) {
        var escaner = new Scanner(System.in);
        var random = new Random();

 
            System.out.print("Por favor, ingresa tu nombre: ");
            String nombre = escaner.nextLine();

            System.out.print("Por favor, ingresa tu apellido: ");
            String apellido = escaner.nextLine();

            System.out.print("Por favor, ingresa tu año de nacimiento (yyyy): ");
            String anioNacimiento = escaner.nextLine();

            // Normalización
            String nombre2 = nombre.trim().toUpperCase();
            nombre2 = nombre2.length() >= 2 ? nombre2.substring(0, 2) : nombre2;

            String apellido2 = apellido.trim().toUpperCase();
            apellido2 = apellido2.length() >= 2 ? apellido2.substring(0, 2) : apellido2;

            String anioNacimientoFormat = anioNacimiento.trim();
            anioNacimientoFormat = anioNacimientoFormat.length() >= 3
                    ? anioNacimientoFormat.substring(2)
                    : anioNacimientoFormat;

            // Generar valor aleatorio
            int numeroAleat = random.nextInt(9999) + 1;

            // Formatear a 4 dígitos
            String formatoNumeroAleat = String.format("%04d", numeroAleat);

            // Generar ID
            String IdUnico = nombre2 + apellido2 + anioNacimientoFormat + formatoNumeroAleat;

            System.out.println("\nHola, " + nombre);
            System.out.println("\tTu ID generado por el sistema es:");
            System.out.println("\t" + IdUnico);

    
}
}


    
