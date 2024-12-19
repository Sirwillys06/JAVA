
import java.util.Scanner;

public class RetcRecetaCocina {


public static void main(String[] args) {
    
    var escaner= new Scanner(System.in);

    System.out.println("****Receta de cocina****");

    System.out.print("Nombre de la receta: ");
    String n_receta=  escaner.nextLine();

    System.out.print("Ingredientes: ");
    String ingredientes= escaner.nextLine();

    System.out.print("Tiempo de preparacion (min): ");
    int tiempo = Integer.parseInt(escaner.nextLine());


    System.out.print("dificualtad (facil, moderado, dificil): ");
    String dificultad = escaner.nextLine();



    System.out.println("****Receta de cocina****");

    System.out.println("Nombre: "+ n_receta);
    System.out.println("ingredientes: "+ ingredientes);
    System.out.println("Tiempo de preparacion: " + tiempo);
    System.out.println("Dificultad: " + dificultad);










}


}
