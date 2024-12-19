public class FormateoCadenas {

    public static void main(String[] args) {
        
        String nombre = "Juan";
        int edad= 18;
        float salario = 12.568f;


        //formateo con el metodo .format

        var mensaje_format = String.format("Nombre: %s, edad: %d, salario: %f",  nombre, edad, salario);
        System.out.println(mensaje_format);

        //formateo con printf

        System.out.printf("Nombre: %s, edad: %d, salario: %f",  nombre, edad, salario);







    }

}
