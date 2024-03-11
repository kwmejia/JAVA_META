import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] argumentos) {

        Libro objLibro = new Libro("100 años de soledad",
                "Gabriel Garcia M.","01-05-1967",
                false);


        System.out.println(objLibro.getTitulo());


        objLibro.setTitulo("El rastro de tu sangre en la nieve");

        System.out.println(objLibro.getTitulo());

        System.out.println(objLibro.toString());



        Empleado objEmpleado = new Empleado();
        int id = 0;
        Scanner objScanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del empleado");
        objEmpleado.setNombre(objScanner.nextLine());

        System.out.println("Ingresa el salario base del empleado");
        objEmpleado.setSalario(objScanner.nextDouble());

        System.out.println("Ingresa el cargo");
        objEmpleado.setCargo(objScanner.nextLine());

        System.out.println("Ingrese el porcentaje de aumento");
        objEmpleado.aumentarSalario(objScanner.nextDouble());
        objEmpleado.setId(id);
        id ++;

        System.out.println("El salario final del empleado con su respectivo aumento es de:"
        + objEmpleado.getSalario());


    }
}