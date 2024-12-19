
import java.util.Scanner;

public class EjemploSistemaEmpleado {


    public static void main(String[] args) {

        var escaner = new Scanner(System.in);
        
        System.out.println("-------Sistema de empleado---------");
        System.out.println("Porfavor ingresa la siguiente informacion del empleado:");

        System.out.print("Nombre del empleado: ");
        String nombre = escaner.nextLine();

        System.out.print("Ingresa la edad del empleado: ");
        int edad = Integer.parseInt(escaner.nextLine());

        System.out.print("Ingresa el salario del empleado: ");
        float salario = Float.parseFloat(escaner.nextLine());

        System.out.print("El empleado es jefe? (True or False): ");
        boolean estatus = Boolean.parseBoolean(escaner.nextLine());



        System.out.println("----------------------------------------------");

        System.out.println("La informacion del empleado que ingresaste es:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("salario: $" + salario);
        System.out.println("El empleado es jefe: " + estatus);





    }

}
